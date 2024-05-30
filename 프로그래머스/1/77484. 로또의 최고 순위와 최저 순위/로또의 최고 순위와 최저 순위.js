function solution(lottos, win_nums) {
    
    var rank = {
        6 : 1,
        5 : 2,
        4 : 3,
        3 : 4,
        2 : 5,
        1 : 6,
        0 : 6
    };
    
    var correct = lottos.filter((a) => win_nums.includes(a)).length;
    var magicNumber = lottos.filter((a) => a == 0).length;

    var maxNumber = correct + magicNumber; 
    var minNumber = correct;
    return [rank[maxNumber], rank[minNumber]];
}