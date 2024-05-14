function solution(absolutes, signs) {
    absolutes.forEach((k,v,absolutes) => {
        if (!signs[v]) {
            absolutes[v] = k * (-1);
        }
    });
    
    return absolutes.reduce((a,b) => a+b);


}