from collections import defaultdict


def solution(friends, gifts):
    history = {friend: defaultdict(int) for friend in friends}
    send_score = {friend: 0 for friend in friends}
    receive_score = {friend: 0 for friend in friends}
    answer = {friend: 0 for friend in friends}

    for gift in gifts:
        sender, receiver = gift.split(" ")
        send_score[sender] += 1
        receive_score[receiver] += 1
        history[sender][receiver] += 1

    score = {friend: send_score[friend] - receive_score[friend] for friend in friends}

    for i in range(len(friends)):
        for j in range(i+1, len(friends)):
            if friends[i] == friends[j]:
                continue

            if history[friends[i]][friends[j]] > history[friends[j]][friends[i]]:
                answer[friends[i]] += 1
                continue

            if history[friends[i]][friends[j]] < history[friends[j]][friends[i]]:
                answer[friends[j]] += 1
                continue

            if score[friends[i]] > score[friends[j]]:
                answer[friends[i]] += 1
                continue

            if score[friends[i]] < score[friends[j]]:
                answer[friends[j]] += 1
                continue

    answer = list(sorted(answer.items(), key=lambda x: x[1], reverse=True))

    return answer[0][1]