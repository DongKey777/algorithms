function solution(arr) {
    var answer = [];
    arr.reduce((acc,v) => {
        if (v != Math.min(...arr)) {
            answer.push(v);
        }
    },0);
    return  !answer.length ? [-1] : answer;
}