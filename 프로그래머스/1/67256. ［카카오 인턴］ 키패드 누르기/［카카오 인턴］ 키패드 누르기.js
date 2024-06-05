function solution(numbers, hand) {
    var keypad = {
        1:[0,0],
        2:[0,1],
        3:[0,2],
        4:[1,0],
        5:[1,1],
        6:[1,2],
        7:[2,0],
        8:[2,1],
        9:[2,2],
        '*':[3,0],
        0:[3,1],
        '#':[3,2],
    };
    
    var left = keypad['*'];
    var right = keypad['#'];
    var answer = "";
    for(var num of numbers) {
        var disLeft = distance(left,keypad[num]);
        var disRight = distance(right,keypad[num]);
    
        if ([1,4,7].includes(num)) {
            answer += "L";
            left = keypad[num];            
        } else if ([3,6,9].includes(num)) {
            answer += "R";
            right = keypad[num];            
        } else {
            if (disLeft > disRight) {
                answer += "R";
                right = keypad[num];
            }else if  (disLeft < disRight){
                answer += "L";
                left = keypad[num];
            }else {
                if (hand == "right") {
                    answer += "R";
                    right = keypad[num];
                }else{
                    answer += "L";
                    left = keypad[num]; 
                }
            }  
        }
    }
    return answer;
}
    
function distance(hand, number)  {
    return Math.abs(hand[0] - number[0]) + Math.abs(hand[1] - number[1]);
}