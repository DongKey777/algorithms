function solution(t, p) {
    
    var count = 0;
    for(var i=0; i<=t.length-p.length; i++) {
        if(t.slice(i,i+p.length) <= p) {
            console.log(t.slice(i,i+p.length));
            count += 1;
        }
    }
    
    return count;
}