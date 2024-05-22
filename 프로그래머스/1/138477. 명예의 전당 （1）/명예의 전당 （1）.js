function solution(k, score) {
    var rank = [];
    var answer = [];
    for(var sc of score) {
        rank.push(sc);
        rank = rank.sort((a,b) => b-a).slice(0,k);        
        answer.push(rank[rank.length-1]);
    }
 
    return answer;
}