def solution(t, p):

    cnt = 0
    for i in range(0,len(t) -len(p) + 1):
        if int(t[i:i+len(p)]) <= int(p):
            # print(int(t[i:i+len(p)]))
            cnt += 1
        
    return cnt