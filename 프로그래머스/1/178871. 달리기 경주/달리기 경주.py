def solution(players, callings):
    pos = {}
    for idx,player in enumerate(players):
        pos[player] = idx
    
    for name in callings:
        idx = pos[name]
        front = players[idx-1]
        
        players[idx] , players[idx-1] = players[idx-1] , players[idx]
        
        pos[front] = idx
        pos[name] = idx-1

    return players
        
        
        
