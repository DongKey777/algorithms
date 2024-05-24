function solution(nums) {
    
    var pocketDic = {};
    
    nums.forEach((num,index) => {
        if(pocketDic[num] != undefined) {
            pocketDic[num] += 1;
        }else {
            pocketDic[num] = 1;
        }
    })
    var pocketDicEntries = Object.entries(pocketDic).sort((a,b) => a[1] -b[1]);
    var pocketMon = nums.length / 2 ;
    
    if (pocketMon >= pocketDicEntries.length) {
        return pocketDicEntries.length;
    } else {
        return pocketMon;
    }
}

