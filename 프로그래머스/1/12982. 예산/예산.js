function solution(d, budget) {
    var count = 0;
    d.sort((a,b) => a-b).reduce((acc,v) => {
        if (acc - v < 0) {
            return acc;
        }else {
        acc -= v;
        count += 1;
        return acc;
        }
    }, budget);
    
    return count;
}