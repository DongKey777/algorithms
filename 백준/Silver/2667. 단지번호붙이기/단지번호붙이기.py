from collections import deque

n = int(input())

graph = [list(map(int, list(input()))) for _ in range(n)]


def bfs(a, b):
    queue = deque()
    queue.append((a, b))
    graph[a][b] = 0
    cnt = 1

    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if graph[nx][ny] != 0:
                graph[nx][ny] = 0
                queue.append((nx, ny))
                cnt += 1

    return cnt


cnt_town = 0
cnt_house = []
for i in range(n):
    for j in range(n):
        if graph[i][j] != 0:
            cnt_town += 1
            cnt_house.append(bfs(i, j))

print(cnt_town)
for house in sorted(cnt_house):
    print(house)
