function solution(s, n) {
    var answer = "";
    console.log(toAscii(s));
    for(var c of [...s]) {
        if (c == " ") {
            answer += " ";
        } else if (65 <= toAscii(c) && toAscii(c) <= 90) {
            answer += String.fromCharCode((toAscii(c) + n - 65) % 26 + 65);
        } else {
            answer += String.fromCharCode((toAscii(c) + n - 97) % 26 + 97);
        }
    }
    
    return answer;
}
        

var toAscii = (a) => {
   return a.charCodeAt(0); 
}