N = int(input())


def power(a):
    result = 1
    if a > 0:
        result = a * power(a - 1)

    return result


print(power(N))
