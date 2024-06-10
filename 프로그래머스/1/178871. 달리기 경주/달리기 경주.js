function solution(players, callings) {
    // 플레이어의 현재 인덱스를 추적하는 해시 맵 생성
    var playersDic = players.reduce((acc, v, i) => {
        acc[v] = i;
        return acc;
    }, {});

    for (var call of callings) {
        var index = playersDic[call];
        if (index > 0) {
            // 현재 플레이어와 이전 플레이어의 인덱스를 교환
            var previousPlayer = players[index - 1];
            playersDic[call] -= 1;
            playersDic[previousPlayer] += 1;
            
            // players 배열에서 위치를 교환
            [players[index], players[index - 1]] = [players[index - 1], players[index]];
        }
    }

    return players;
}