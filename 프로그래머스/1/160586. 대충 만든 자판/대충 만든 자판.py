def solution(keymap, targets):
    dic = {}
    for str in keymap:
        chars = list(str)
        for i in range(len(chars)):
            if chars[i] not in dic.keys():
                dic[chars[i]] = i+1
            elif i+1 < dic[chars[i]]:
                dic[chars[i]] = i+1
                
    answer = [0] * len(targets)
    
    for i in range(len(targets)):
        for ch in list(targets[i]):
            if ch in dic.keys():
                answer[i] += dic[ch]
            else:
                answer[i] = -1
                break   
                
    return answer