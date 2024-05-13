function solution(arr) {
    var sum = 0;
    arr.map((a) => sum += a) 
    return sum / arr.length;
}