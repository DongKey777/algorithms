function solution(s) {
    var dic = new Object();
    dic["zero"] = 0;
    dic["one"] = 1;
    dic["two"] = 2;
    dic["three"] = 3;
    dic["four"] = 4;
    dic["five"] = 5;
    dic["six"] = 6;
    dic["seven"] = 7;
    dic["eight"] = 8;
    dic["nine"] = 9;
    
    currentWord = [];
    answer = "";
    for(var c of [...s]) {
        if (c<="9" && c >= "0") {
            if (currentWord.length != 0 ) {
                answer += (dic[currentWord.join("")]);
            }
            answer += c;
            currentWord = [];
        }
        else{
            if (currentWord.join("") in dic) {
                answer += (dic[currentWord.join("")]);
                currentWord = [];
            } 
            currentWord.push(c);
        }
    }
    if (currentWord.join("") in dic) {
    answer += (dic[currentWord.join("")]);
    }
    return +answer;
}