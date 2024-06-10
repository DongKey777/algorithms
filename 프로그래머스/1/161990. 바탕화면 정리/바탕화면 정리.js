function solution(wallpaper) {
    
    var x = [];
    var y = [];
    
    for(var i=0; i<wallpaper.length; i++) {
        for(var j=0; j<wallpaper[0].length; j++) {
            if (wallpaper[i][j] == "#") {
                x.push(i);
                y.push(j);
            }
        }
    }
    console.log(x,y)
    x.sort((a,b) => a-b);
    y.sort((a,b) => a-b);
    
    return [x[0], y[0], x[x.length-1]+1, y[y.length-1]+1];
}