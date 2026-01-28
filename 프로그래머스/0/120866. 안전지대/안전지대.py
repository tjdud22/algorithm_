def solution(board):
    answer = 0
    dx = [-1,0,1,1,1,0,-1,-1]
    dy = [1,1,1,0,-1,-1,-1,0]
    
    for x,row in enumerate(board):
        for y,point in enumerate(row):
            if point == 1 :
                for i in range(len(dx)):
                    if(x+dx[i] >=0 and x+dx[i] <len(board) and y+dy[i]>=0 and y+dy[i]<len(board) and board[x+dx[i]][y+dy[i]] == 0):
                        board[x+dx[i]][y+dy[i]] = 2
            
    for row in board:
        answer+= row.count(0)
    return answer