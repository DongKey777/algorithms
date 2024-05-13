function solution(s){
    var countP = 0;
    var countY = 0;
    
    for(var c of s.toLowerCase()) {
        if (c == 'p') {
            countP += 1;            
        } else if (c == 'y') {
            countY += 1;
        }
    }
    
    return countP == countY ? true : false;
}