function solution(keymap, targets) {
    
    var keys = {};
    
    for(key of keymap) {
        for (var idx = 0; idx < key.length; idx++) {
            if (key[idx] in keys && idx+1 < keys[key[idx]]) {
                keys[key[idx]] = idx+1;
            }else if (!(key[idx] in keys)) {
                keys[key[idx]] = idx+1;
            }
        }
    }
    console.log(keys);
    
    
    
    
    var answer = [];
    for (var target of targets) {
        var count = 0;
        for(var ca of [...target]) {
            if (ca in keys) {
                count += keys[ca];
            }else {
                count = -1;
                break;
            }
        }
        answer.push(count);
    }
    return answer;
}