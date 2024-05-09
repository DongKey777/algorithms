function solution(hp) {

    let generalAnt = Math.floor(hp / 5);
    hp = hp % 5;
    
    let armyAnt = Math.floor(hp / 3);
    hp = hp % 3;
    
    let workerAnt = Math.floor(hp / 1);
    
    return generalAnt + armyAnt + workerAnt;
}