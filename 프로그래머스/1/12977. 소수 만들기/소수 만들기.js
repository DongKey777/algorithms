
// function checker(num) {
//     if (num <= 1) return false;
//     if (num <= 3) return true;
//     if (num % 2 == 0 || num % 3==0) return false;

//     for(var i=5; i<Math.sqrt(num); i+= 6) {
//         if (num % i == 0) return false;
//     }
    
//     return true;
// }

// function solution(nums) {
//     var answer = 0;
//     for(var i=0; i<nums.length-2; i++) {
//         for(var k=i+1; k<nums.length-1; k++) {
//             for(var j=k+1; j<nums.length; j++) {
//                 if (checker(nums[j] + nums[k] + nums[i])) {
//                     answer += 1;
//                 }
//             }
//         }
//     }
    
//     return answer;
// }
function checker(num) {
    if (num <= 1) return false;
    if (num <= 3) return true;
    if (num % 2 === 0 || num % 3 === 0) return false;

    let sqrt = Math.sqrt(num);
    for (let i = 5; i <= sqrt; i += 6) {
        if (num % i === 0 || num % (i + 2) === 0) return false;
    }
    return true;
}

function solution(nums) {
    var answer = 0;
    for (var i = 0; i < nums.length - 2; i++) {
        for (var k = i + 1; k < nums.length - 1; k++) {
            for (var j = k + 1; j < nums.length; j++) {
                if (checker(nums[i] + nums[k] + nums[j])) {
                    answer += 1;
                }
            }
        }
    }
    return answer;
}