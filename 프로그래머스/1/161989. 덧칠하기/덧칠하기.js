function solution(n, m, section) {
    var current = section[0];
    var count = 1;
    for(var sec of section) {
        if (sec - current + 1 > m) {
            count += 1;
            current = sec;
        }
    }
    return count;
}


