function solution(s) {
    var answer = [];
    
    for (var word of s.split(" ")) {
        answer.push([...word].map((a,i) => {
        if ((i % 2) == 0) {
            return a.toUpperCase();
        } else {
            return a.toLowerCase();
        }
    }).join(""));
    };
    return answer.join(" ");
}