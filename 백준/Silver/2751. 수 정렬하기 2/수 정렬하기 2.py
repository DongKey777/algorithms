import sys

n = int(input())

nums = []

for _ in range(n):
    nums.append(int(sys.stdin.readline()))

for i in sorted(nums):
    print(i)
