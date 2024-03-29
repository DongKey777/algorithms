from collections import deque

n, m = map(int, input().split(" "))

graph = []

for _ in range(n):
    graph.append(list(map(int, list(input()))))

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]


def bfs(a, b):
    queue = deque()
    queue.append((a, b))

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] == 1:
                queue.append((nx, ny))
                graph[nx][ny] += graph[x][y]


bfs(0, 0)
print(graph[n-1][m-1])