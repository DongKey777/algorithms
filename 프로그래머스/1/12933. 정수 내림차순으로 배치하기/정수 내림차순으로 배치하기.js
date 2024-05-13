function solution(n) {
    var answer = [];
    
    for(var k of (n+"")) {
        answer.push(parseInt(k));
    }
    
    answer.sort((a,b) => b-a);
    
    
    return parseInt(answer.join(""));
}