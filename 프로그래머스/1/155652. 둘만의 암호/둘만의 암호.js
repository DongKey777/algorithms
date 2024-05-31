function solution(s, skip, index) {
    let alpabet = [];
    for(let alpa = 97; alpa<= 122; alpa++) {
        var c = String.fromCharCode(alpa);
        if (!skip.includes(c)) { 
            alpabet.push(c);
        }
    }
    
    alpabet = alpabet.concat(alpabet).concat(alpabet);
    var answer = ""
    for(var c of [...s]) {
            answer += alpabet[alpabet.indexOf(c) + index];
    }
  
    return answer;
}