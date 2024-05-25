function solution(number, limit, power) {
    var answer = 0;

    for (var num = 1; num <= number; num++) {
        var count = 0;
        for (var k = 1; k <= Math.sqrt(num); k++) {
            if (num % k == 0) {
                count++;
                if (k != num / k) {
                    count++;
                }
            }
            if (count > limit) {
                answer += power;
                break;
            }
        }
        if (count <= limit) {
            answer += count;
        }
    }

    return answer;
}