function solution(x) {
    
    if (x % ((x+"").split("").map((a) => parseInt(a)).reduce((a,b) => a+b)) == 0){
        return true;
    }
    
    return false;
}