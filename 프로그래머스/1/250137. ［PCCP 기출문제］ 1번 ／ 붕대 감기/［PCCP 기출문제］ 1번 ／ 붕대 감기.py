from collections import deque

def solution(bandage, health, attacks):
    answer = 0
    current_health = health
    attacks = deque(attacks)
    
    live = True
    healing_time = 0
    last_time = attacks[-1][0]
    for i in range(last_time+1):
        
        if len(attacks) != 0  and attacks[0][0]== i:
            current_health -= attacks[0][1]
            attacks.popleft()
            healing_time = 0
            
        else:
            current_health += bandage[1]
            healing_time += 1
            
            if healing_time == bandage[0]:
                current_health += bandage[2]
                healing_time = 0
        
        if current_health > health :
            current_health = health
    
        if current_health <= 0:
            live = False
            break
        
        if len(attacks) == 0:
            break
            
    if not live:
        return -1
    else:
        return current_health
