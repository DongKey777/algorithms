def elevator_button_press(F, S, G, U, D):
    visited = [False] * (F + 1)  # 각 층을 방문했는지 여부를 저장하는 리스트
    queue = [(S, 0)]  # 현재 층과 누른 버튼 횟수를 저장하는 큐

    while queue:
        current_floor, button_press = queue.pop(0)

        if current_floor == G:  # G층에 도착했을 때
            return button_press

        up_floor = current_floor + U
        down_floor = current_floor - D

        if 1 <= up_floor <= F and not visited[up_floor]:
            visited[up_floor] = True
            queue.append((up_floor, button_press + 1))

        if 1 <= down_floor <= F and not visited[down_floor]:
            visited[down_floor] = True
            queue.append((down_floor, button_press + 1))

    return "use the stairs"  # G층에 도착할 수 없는 경우

# 입력 받기
F, S, G, U, D = map(int, input().split())

# 결과 출력
result = elevator_button_press(F, S, G, U, D)
print(result)