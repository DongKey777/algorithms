from collections import deque


def solution(n, edge):
    answer = 0
    graph =  [[] for _ in range(n+1)]
    dis = [-1] * (n+1)

    for conn in edge:
        graph[conn[0]].append(conn[1])
        graph[conn[1]].append(conn[0])

    q = deque([1])
    dis[1] = 0


    while q:
        now = q.popleft()

        for i in graph[now]:
            if dis[i] == -1:
                q.append(i)
                dis[i] = dis[now] + 1


    for i in dis:
        if i == max(dis):
            answer += 1

    return answer