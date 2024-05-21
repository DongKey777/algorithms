function solution(n, arr1, arr2) {
    var secretMap = [];
    for(var i=0; i<n; i++) {

        var arrMap1 = arr1[i].toString(2);
        var arrMap2 = arr2[i].toString(2);

        if (arrMap1.length < n) {
        arrMap1 = "0".repeat(n-arrMap1.length)  + arrMap1;
        }
        
        if (arrMap2.length < n) {
        arrMap2 = "0".repeat(n-arrMap2.length)  + arrMap2;
        }
    
        var val = "";
        for(var j=0; j<n; j++) {
            if (arrMap1[j] == "1" || arrMap2[j] == "1") {
                val += "#";
            }else {
                val += " ";
            }
        }
        secretMap.push(val);
    }
    return secretMap;
}