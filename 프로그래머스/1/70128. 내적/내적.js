function solution(a, b) {
    return a.reduce((acc,k,i) => acc += k*b[i], 0);
}