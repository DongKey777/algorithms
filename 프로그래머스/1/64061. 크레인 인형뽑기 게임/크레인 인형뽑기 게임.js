function solution(board, moves) {
    
    let dollMap = board.reduce((acc,v) => {
        for(var i=0; i<v.length; i++) {
            if((i+1) in acc && v[i] != 0) {
                acc[i+1].push(v[i]);
            }else if(!((i+1) in acc)) {
                if (v[i] == 0) {
                    acc[i+1] = [];
                }else{
                    acc[i+1] = [v[i]];
                }
            }
        }
        return acc;
    }, {})
    
    
    console.log(dollMap);
    
    let answer = [];
    let count = 0;
    
    for(let move of moves) {
        if(move in dollMap && dollMap[move].length != 0) {
           answer.push(dollMap[move].shift());
        }else {
            continue;
        }
        
        if (answer.length >= 2 && answer[answer.length-1] == answer[answer.length-2]) {
            count += 2;
            answer.splice(-2);
        }
    }    

    if (answer.length >= 2 && answer[answer.length-1] == answer[answer.length-2]) {
        count += 2;
    }
    return count;
}
