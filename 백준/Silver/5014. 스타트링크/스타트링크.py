from collections import deque

F, S, G, U, D = map(int, input().split())

graph = [0] * (F + 1)


def bfs(start):
    queue = deque()
    queue.append(start)

    while queue:
        floor = queue.popleft()

        if graph[G] != 0 or S == G:
            break

        for i in (U, (-1) * D):

            new_floor = floor + i
            if new_floor < 1 or new_floor > F or graph[new_floor] != 0 or new_floor == floor:
                continue

            graph[new_floor] = graph[floor] + 1
            queue.append(new_floor)


bfs(S)
if graph[G] == 0 and G != S:
    print("use the stairs")

elif graph[G] != 0:
    print(graph[G])
    
else:
    print("0")
