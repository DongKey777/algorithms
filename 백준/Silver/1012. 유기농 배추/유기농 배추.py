from collections import deque

T = int(input())
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]


def bfs(graph, a, b):
    queue = deque()
    queue.append((a, b))
    graph[a][b] = 0
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= M or ny < 0 or ny >= N or graph[nx][ny] == 0:
                continue

            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append((nx, ny))


for _ in range(T):
    M, N, K = map(int, input().split())
    graph = [[0] * N for j in range(M)]
    cnt = 0

    for _ in range(K):
        i, j = map(int, input().split())
        graph[i][j] = 1

    for i in range(M):
        for j in range(N):
            if graph[i][j] == 1:
                cnt += 1
                bfs(graph, i, j)

    print(cnt)
