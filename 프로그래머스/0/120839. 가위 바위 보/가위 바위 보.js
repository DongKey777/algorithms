function solution(rsp) {
    
    var answer = Array.from(rsp);
    var q = "";
    for(let r of rsp ) {
        if (r=='2') {
            q += '0';
        } else if (r=='0') {
            q += '5';
        } else {
            q += '2';
        }
    }
    
    return q;
}