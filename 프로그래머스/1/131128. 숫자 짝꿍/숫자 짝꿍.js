function solution(X, Y) {
    
    var answer = [];
    
    X_dic = [...X].reduce((d,v) => {
        if (v in d) {
            d[v] += 1;
        }else {
           d[v] = 1; 
        }
        return d;
    },{});
    
    for(let c of [...Y]) {
        if (c in X_dic && X_dic[c] > 0) {
            X_dic[c] -= 1;
            answer.push(c);
        }  
    }
    if (answer.length != 0) {
        var result = answer.sort((a,b) => {
            if (a > b) {
                return -1
            }else {
                return 1
            }
        }).join("");
    }else {
        return "-1";
    }
    
    if (parseInt(result) == 0) {
        return "0";
    }
    
    return result;
}