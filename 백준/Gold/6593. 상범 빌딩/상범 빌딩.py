from collections import deque

while True:
    L, R, C = map(int, input().split())
    if L == 0 and R == 0 and C == 0:
        break
    graph = [[[] for _ in range(R)] for _ in range(L)]

    for i in range(L):
        for j in range(R):
            graph[i][j] = list(input())

        input()


    def bfs(l, r, c):
        queue = deque()
        queue.append((l, r, c))
        graph[l][r][c] = 0

        dl = [0, 0, 0, 0, 1, -1]
        dr = [1, -1, 0, 0, 0, 0]
        dc = [0, 0, 1, -1, 0, 0]

        while queue:
            l, r, c = queue.popleft()

            for i in range(6):
                nl = l + dl[i]
                nr = r + dr[i]
                nc = c + dc[i]

                if nl < 0 or nl >= L or nr < 0 or nr >= R or nc < 0 or nc >= C:
                    continue
                if graph[nl][nr][nc] == "#":
                    continue

                if graph[nl][nr][nc] == "E":
                    return graph[l][r][c] + 1

                if graph[nl][nr][nc] == ".":
                    graph[nl][nr][nc] = graph[l][r][c] + 1
                    queue.append((nl, nr, nc))

        return "Trapped!"


    answer = []
    for i in range(L):
        for j in range(R):
            for k in range(C):
                if graph[i][j][k] == "S":
                    answer.append(bfs(i, j, k))

    for i in answer:
        if type(i) == int:
            print("Escaped in", i, "minute(s).")
        else:
            print(i)
