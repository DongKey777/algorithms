function solution(survey, choices) {
    var score = {
        1 : 3,
        2 : 2,
        3 : 1,
        4 : 0,
        5 : -1,
        6 : -2,
        7 : -3,
    };
    
    let mind = survey.reduce((acc, v) => {
        v.split("").forEach((a) => acc[a] = 0 );
        return acc;
    },{})
    
    for(var i=0; i<choices.length; i++) {
        [first, second] = survey[i].split("");
        var result = score[choices[i]];
        if (result > 0) {
            mind[first] += result;
        }else if (result < 0) {
            mind[second] -= result;
        }
    }
    var answer = ""
    
    var units = ["RT", "CF", "JM", "AN"];
    for(var i=0; i<units.length; i++) {
        [first, second] = [...units[i]];
        
        if (mind[first] > mind[second]) {
            answer += first;
        }else if (mind[first] < mind[second]) {
            answer += second;
        }else {
            answer += sort(first, second)[0];
        }
    }
    return answer;
}


function sort(a,b) {
    if ( a < b) {
        return [a,b];
    }else {
        return [b,a];
    }
}