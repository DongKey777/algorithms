function solution(price, money, count) {    
    var countSum = 0;
    for(var i=1; i<=count; i++) {
        countSum += i;
    }
    
    return  (money - price * countSum) > 0 ? 0 : Math.abs((money - price * countSum));
}