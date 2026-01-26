def solution(n):
    answer = [[0]*n for _ in range(n)]
    
    x,y=0,0
    dir = 0
    num = 1
    
    while(num <= n*n):
        answer[x][y] = num
        num +=1
        if dir == 0:
            if(y<n-1 and answer[x][y+1] == 0):
                y+=1
            else:
                dir = 1
                x+=1
        elif dir == 1:
            if(x<n-1 and answer[x+1][y] == 0):
                x+=1
            else:
                dir = 2
                y-=1
        elif dir == 2:
            if(y>=1 and answer[x][y-1] == 0):
                y-=1
            else:
                dir = 3
                x-=1
        elif dir == 3:
            if(x>=1 and answer[x-1][y] == 0):
                x-=1
            else:
                dir = 0
                y+=1
                
    
    return answer