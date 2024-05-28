function solution(babbling) {
    var words = ["aya", "ye", "woo", "ma"];
    var canSpeaking = [];
    for(var i=0; i<words.length; i++) {
        babbling = babbling.map((a) => a.replaceAll(words[i],i));
    }
    var current = "";
    var count = 0;
    for(var bab of babbling) {
        var check = true;
        var cur = "";
        for(var c of [...bab]) {
            if (isNaN(c)) {
                check = false;
                break;
            } else if (cur === "") {
                cur = c;
            } else if (cur == c) {
                check = false;
                break;
            } else {
                cur = c;
            }
        }
        
        if (check) {
            count += 1;
        }
    }
    return count;
}