def solution():
    N, M = map(int, input().split(" "))
    board = []
    
    for _ in range(N):
        board.append(list(input()))
    
    minFix = 100000000
    
    for i in range(0, N-7):
        for j in range(0, M-7):
            count = min(checker(i,j,board,"W"), checker(i,j,board,"B"))
            minFix = min(minFix, count)
    
    print(minFix)
        
def checker(i,j,board, startColor):
        count = 0 
        
        for m in range(i, i+8):
            for n in range(j, j+8):
                if (m-i+n-j) % 2 == 0:
                    if board[m][n] != startColor:
                        count += 1
                else:
                    if board[m][n] == startColor:
                        count += 1
        return count
    
solution()