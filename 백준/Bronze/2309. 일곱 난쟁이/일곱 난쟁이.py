def solution():
    dwarfs = []

    for _ in range(9):
        dwarfs.append(int(input()))

    dwarfs.sort()

    sumAll = sum(dwarfs)

    answer = []
    for i in range(0, 9):
        for j in range(i+1, 9):
            if sumAll - dwarfs[i] - dwarfs[j] == 100:
                answer = [i,j]
                break
    for k in range(9):
        if k == answer[0] or k == answer[1]:
             continue
        print(dwarfs[k])

solution()