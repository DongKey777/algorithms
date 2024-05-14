function solution(x, n) {
    var answer = [];
    
    var count = 0;
    var dx = x;
    answer.push(dx);
    while(answer.length != n) {
        x += dx;
        
        answer.push(x);
        count += 1;
    }
    return answer;
}