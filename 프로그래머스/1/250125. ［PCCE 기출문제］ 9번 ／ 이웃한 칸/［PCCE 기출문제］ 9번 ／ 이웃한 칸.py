def solution(board, h, w):
    color =  board[h][w]
    dh = [1,-1,0,0]
    dw = [0,0,1,-1]
    cnt = 0
    
    for i in range(4):
        nh = h + dh[i]
        nw = w + dw[i]
        
        if nh < 0 or nh >= len(board) or nw < 0 or nw >= len(board[0]):
            continue
        if board[nh][nw] == color:
            cnt += 1
                
    return cnt