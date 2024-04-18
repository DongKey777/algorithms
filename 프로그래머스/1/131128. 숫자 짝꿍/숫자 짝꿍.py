def solution(X,Y):
    X_numbers = [0] * 10
    Y_numbers = [0] * 10         
    answer = []
    
    for num in X:
        X_numbers[int(num)] += 1
    
    for num in Y:
        Y_numbers[int(num)] += 1

    for i in range(10):
        if int(X_numbers[i]) > 0 and int(Y_numbers[i]) > 0:
            for _ in range(min(X_numbers[i], Y_numbers[i])):
                answer.append(str(i))     
    
    answer.sort(reverse =True)
    
    if len(answer) == 0:
        return "-1"
    
    if answer[0] == "0":
        return "0"
    
    return "".join(answer)
