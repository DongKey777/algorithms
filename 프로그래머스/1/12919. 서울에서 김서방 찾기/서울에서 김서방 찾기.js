function solution(seoul) {
    
    let index;
    
    seoul.forEach((k,v) => {
        if (k == "Kim") {
            index = v;
        }
    })    
    answer = "김서방은 " + index + "에 있다";

    return answer;
}