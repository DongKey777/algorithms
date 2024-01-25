def solution(wallpaper):
    y = []
    x = []
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[0])):
            if wallpaper[i][j] == '#':
                y.append(i)
                y.append(i + 1)
                x.append(j)
                x.append(j + 1)

    x.sort()
    y.sort()

    answer = []

    answer.append(y[0])
    answer.append(x[0])
    answer.append(y[-1])
    answer.append(x[-1])

    return answer