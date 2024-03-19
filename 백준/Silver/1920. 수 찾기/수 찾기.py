import sys

N = int(sys.stdin.readline())
nums = sorted(list(map(int, sys.stdin.readline().split())))

M = int(sys.stdin.readline())
target_nums = list(map(int, sys.stdin.readline().split()))

for num in target_nums:
    left = 0
    right = len(nums) - 1
    found = False
    while left <= right:
        pivot = (left + right) // 2

        if nums[pivot] == num:
            found = True
            break
        elif nums[pivot] > num:
            right = pivot - 1

        else:
            left = pivot + 1

    if found:
        print(1)
    else:
        print(0)