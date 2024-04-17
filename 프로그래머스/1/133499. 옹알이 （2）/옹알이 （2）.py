def solution(babbling):
    
    answer = 0
    memories = ["aya", "ye", "woo", "ma"]
      
    for word in babbling:
        for memory in memories:
            if memory * 2 not in word:
                word = word.replace(memory, ' ')
        if word.isspace():
            
            answer += 1 
        
    return answer