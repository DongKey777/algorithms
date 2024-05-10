function solution(array) {
    var maxV = Math.max(...array);
    var answer = [];
    for(var i=0; i<array.length; i++) {
        if (array[i] == maxV) {
            answer.push(maxV);
            answer.push(i);
        }
    }
    
    return answer;
}