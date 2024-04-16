def solution(food):
    answer = ''
    new_food = []
    for i in food:
        if (i % 2 != 0):
            i -= 1
        new_food.append(i)
    print(new_food)
    for i in range(1, len(new_food)):
        answer += str(i) * (new_food[i] // 2) 
    answer = answer + "0" + answer[::-1]
    return answer