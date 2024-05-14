function solution(phone_number) {
    var answer = "";
    
    [...phone_number].forEach((v,i) => {
        if (phone_number.length - i <= 4) {
            answer += v;
        } else {
            answer += "*";
        }
    });
    
    return answer;
}