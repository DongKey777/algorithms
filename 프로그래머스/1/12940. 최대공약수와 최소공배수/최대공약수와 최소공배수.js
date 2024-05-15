function solution(n, m) {
    var minNum = Math.min(n,m);
    var maxNum = Math.max(n,m);
    
    var div = 0;
    var mul = 0;
    for(var i=minNum; i>0; i--) {
        if ( n % i == 0 && m % i == 0) {
            div = i;
            break
        }
    }
        
    for(var i=minNum; i<=maxNum*minNum ; i++) {
        if (i % n == 0 && i % m == 0) {
            mul = i;
            break
        }
    }
        
    return [div,mul];
}
    