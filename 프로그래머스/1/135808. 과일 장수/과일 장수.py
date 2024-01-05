def solution(k, m, score):
    score.sort()
    
    if len(score) >= m:
        score = score[len(score) % m:]
    box = []
    answer = 0
    while (len(score) != 0):
        if len(box) == m:
            answer += min(box) * m
            box.clear()
        else:
            box.append(score.pop())
    if len(box) == m:
        answer += min(box) * m
    return answer