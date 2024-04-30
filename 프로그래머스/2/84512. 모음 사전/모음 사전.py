def solution(word):
    answer = 0
    word_list = []
    words = "AEIOU"

    def dfs(count, w):

        if count == 5:
            return
        
        for i in range(len(words)):
            word_list.append(w + words[i])
            dfs(count+1, w + words[i])
    
    dfs(0, "")
    return word_list.index(word) + 1 