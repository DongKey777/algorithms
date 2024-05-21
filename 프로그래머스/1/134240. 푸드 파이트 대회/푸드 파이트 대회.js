function solution(food) {
    var word = "";
    
    food.map((c, index) => {
        word += index.toString().repeat(Math.floor(c/2));
    })
    
    
    word = word + "0" + [...word].reverse().join("");
    
    return word;
    
}