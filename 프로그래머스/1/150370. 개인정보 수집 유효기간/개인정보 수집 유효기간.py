def solution(today, terms, privacies):
    answer = []
    terms_dict = {}
    for term in terms:
        term_split = term.split(" ")
        terms_dict[term_split[0]] = int(term_split[1])

    order = 1

    for i in range(len(privacies)):
        get_date = privacies[i].split(" ")[0]
        term = privacies[i].split(" ")[1]

        year, month, day = map(int, get_date.split("."))

        month += terms_dict[term]
        day -= 1

        due_date = adjust_date(year, month, day, term, terms_dict)

        today_year, today_month, today_day = map(int, today.split("."))
        
        print(i, today_year, today_month, today_day, due_date[0], due_date[1], due_date[2])
        if today_year < due_date[0]:
            continue
        if today_year == due_date[0] and today_month < due_date[1]:
            continue
        if today_year == due_date[0] and today_month == due_date[1] and today_day <= due_date[2]:
            continue

        answer.append(i+1)

    return answer


def adjust_date(year, month, day, term, terms_dict):

    if month > 0 and month <= 12 and day > 0 and day <= 28:
        return [year, month, day]

    if day < 1:
        day = 28 - abs(day)
        month -= 1

    if day > 28:
        day -= 28
        month += 1

    if month > 12:
        year += 1
        month -= 12

    if month < 1:
        year -= 1
        month = 12 - abs(month)

    return adjust_date(year, month, day, term, terms_dict)



