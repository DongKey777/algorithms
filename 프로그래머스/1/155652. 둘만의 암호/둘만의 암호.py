def solution(s, skip, index):
    alpha_number = [i for i in range(97, 123) if chr(i) not in skip]
    answer = []
    for c in s:
        new_index = alpha_number.index(ord(c)) + index
        answer.append(chr(alpha_number[new_index % len(alpha_number)]))
    return "".join(answer)
