def solution():
    N = int(input())

    for i in range(1,N):
        r = 0
        k = i
        while(k!=0):
            r += k % 10 
            k = k // 10
        if r + i == N:
            print(i)
            break
    else:
        print(0)
    
solution()