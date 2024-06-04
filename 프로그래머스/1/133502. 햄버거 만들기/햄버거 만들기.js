function solution(ingredient) {
    var answer = 0;
    var q = [];
    for(let ingredi of ingredient) {
        q.push(ingredi);
        if (q.length >= 4
            && q.slice(q.length-4, q.length).join("") == "1231") {
            q.splice(-4);
            answer += 1;
        }
    }
    
    
    return answer;
}