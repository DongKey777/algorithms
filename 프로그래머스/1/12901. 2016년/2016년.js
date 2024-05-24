function solution(a, b) {
    var months = [0,31,29,31,30,31,30,31,31,30,31,30,31];    
    var days = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"];
    var answer = '';
    
    var countDays = -1;
    for(i=1; i<= a; i++) {
        if (i==a) {
            countDays += b;
        } else {
            countDays += months[i];
        }
    }
    
    return days[countDays % 7];
}