def solution(name, yearning, photo):
    missing = {}
    answer = []
    
    for i in range(len(name)):
        missing[name[i]] = yearning[i]
    
    for pic in photo:
        score = 0
        for people in pic:
            if people in missing.keys():
                score += missing[people]
        answer.append(score)
        
    return answer