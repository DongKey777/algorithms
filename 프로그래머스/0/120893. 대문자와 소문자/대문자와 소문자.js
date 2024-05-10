function solution(my_string) {
    var answer = '';
    
    for (var c of [...my_string]) {
        if (c.toLowerCase() != c) {
            answer += c.toLowerCase();
        }else {
            answer += c.toUpperCase();
        }
    }
    return answer;
}