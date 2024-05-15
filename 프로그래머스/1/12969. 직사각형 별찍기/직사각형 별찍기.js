process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    
    var answer = "";
    for(var i=0; i<a; i++) {
        answer += "*"
    }
    
    for(var i=0; i<b; i++) {
        console.log(answer);
    }
});