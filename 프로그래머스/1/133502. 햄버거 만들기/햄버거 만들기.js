function solution(ingredient) {
    var answer = [];
    var count = 0;
    
    for(let ingredi of ingredient) {
        if (answer.length >= 4) {
            console.log(answer.slice(answer.length-4,answer.length));
            if (answer.slice(answer.length-4,answer.length).join("") == "1231" ) {
                count += 1 ;
                answer.pop()
                answer.pop()
                answer.pop()
                answer.pop()
            }
        } else {
            answer.push(ingredi);
        }
    }
    
    if (answer.length >= 4 && answer.slice(answer.length-4,answer.length).join("") == "1231") {
        count += 1;
    }
    
    return count;
}