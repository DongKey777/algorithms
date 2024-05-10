function solution(my_string) {
    var answer = 0;
    
    var arr = Array.from(my_string);
    
    for(var c of arr) {
        if (!isNaN(c)) {
            answer += parseInt(c,10);
        }
    }
    
    
    return answer;
}