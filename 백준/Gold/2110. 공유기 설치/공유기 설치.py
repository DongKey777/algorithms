import sys

n, c = map(int, sys.stdin.readline().split())

houses = []

for _ in range(n):
    houses.append(int(sys.stdin.readline()))

houses.sort()

left = 1
right = houses[-1] - houses[0]

answer = 0
while left <= right:
    mid = (left + right) // 2
    count = 1
    now_house = houses[0]
    for house in houses:
        if count == 0:
            break

        if house - now_house >= mid:
            count += 1
            now_house = house

    if count >= c:
        left = mid + 1
        answer = mid
    else:
        right = mid - 1

print(answer)
