function solution(name, yearning, photo) {
    var scores = {};
    var answer = [];
    var score = 0;
    name.map((people, index) => scores[people] = yearning[index]);
    
    for(var ph of photo) {
        score = 0;
        for (var p of ph) {
            if (p in scores){ 
                score += scores[p];
            };
        }
        console.log(ph);
        console.log(score);
        answer.push(score);
    }
    return answer;
}