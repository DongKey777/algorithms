def solution():
    n, m = map(int, input().split(" "))

    nums = list(map(int,input().split(" ")))

    maxN = 0

    for i in range(0,n):
        for j in range(i+1,n):
            for k in range(j+1, n):
                sumN = nums[i] + nums[j] + nums[k]
                if sumN <= m and maxN < sumN :
                    maxN = sumN

    print(maxN)

solution()
