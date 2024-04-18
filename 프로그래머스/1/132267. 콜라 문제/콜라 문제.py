def solution(a, b, n):
    answer = 0
    while(True):
        if(n < a):
            break
        new_coke = (n // a) * b 
        n = (n % a) + new_coke
        answer += new_coke
    return answer
