function solution(n) {
    
    for(let k  = 1; k < n; k++) {
        if (n % k == 1) {
            return k;
        }
    }
    
    
}