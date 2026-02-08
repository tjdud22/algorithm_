def solution(wallpaper):
    lux = float('inf')
    luy = float('inf')
    rdx = 0
    rdy = 0
    
    for x,row in enumerate(wallpaper):
        for y in range(len(row)):
            if wallpaper[x][y] == "#":
                lux = min(lux,x)
                luy = min(luy,y)
                rdx = max(rdx,x+1)
                rdy = max(rdy,y+1)
            
    return [lux,luy,rdx,rdy]