N = int(input())

graph = [list(map(int,input())) for _ in range(N)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
num = []
def dfs(x,y):
    if x<0 or x>=N or y<0 or y>=N:
        return False

    if graph[x][y] == 1:
        graph[x][y] = 0
        global count
        count += 1
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]

            dfs(nx,ny)
        return True
    return False

result = 0
count = 0

for i in range(N):
    for j in range(N):
        if dfs(i,j):
            num.append(count)
            result += 1
            count = 0

num.sort()
print(result)
for i in range(len(num)):
    print(num[i])