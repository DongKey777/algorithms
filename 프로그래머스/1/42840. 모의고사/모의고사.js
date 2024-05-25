function solution(answers) {
    var num1 = [1, 2, 3, 4, 5];
    var num2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var num3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    var answer1 = answers.reduce((acc, v, i) => {
        if (v === num1[i % num1.length]) {
            acc += 1;
        }
        return acc;
    }, 0);
                                 
    var answer2 = answers.reduce((acc, v, i) => {
        if (v === num2[i % num2.length]) {
            acc += 1;
        }
        return acc;
    }, 0);
    
    var answer3 = answers.reduce((acc, v, i) => {
        if (v === num3[i % num3.length]) {
            acc += 1;
        }
        return acc;
    }, 0);

    let maxScore = Math.max(answer1, answer2, answer3);
    let result = [];
    if (answer1 === maxScore) result.push(1);
    if (answer2 === maxScore) result.push(2);
    if (answer3 === maxScore) result.push(3);

    return result;
}
