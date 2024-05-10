function solution(cipher, code) {
    var answer = '';
    
    var ciphers = [...cipher]
    
    for (var i=0; i<cipher.length; i++) {
        if ((i+1) % code === 0) {
            answer += ciphers[i];       
        }
    }
    return answer;
}