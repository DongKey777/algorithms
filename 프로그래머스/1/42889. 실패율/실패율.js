function solution(N, stages) {
    var answer = [];
    for(var i=1; i<=N; i++) {
        
        answer.push([stages.filter((a) => a==i).length / stages.filter((a) => a >= i).length, i])  
    }
    
    answer.sort((a,b) => b[0]-a[0]);
    return answer.reduce((acc,v) => {
        acc.push(v[1]);
        return acc;
    },[]);
}