def solution(keyinput, board):
    answer = []
    mode = {
    "left":[-1,0],
    "right":[1,0],
    "down":[0,-1],
    "up":[0,1]}
    
    x,y = 0,0
    for key in keyinput:
        new_x, new_y = x + mode[key][0] , y + mode[key][1]
        if( -(board[0]//2) <= new_x <= board[0]//2 
           and -(board[1]//2) <= new_y <= board[1]//2):
            x,y = new_x , new_y
    return x,y