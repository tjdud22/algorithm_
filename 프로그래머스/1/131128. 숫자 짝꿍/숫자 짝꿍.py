def solution(X, Y):
    answer = ''
    Xarr = {}
    
    for i in X:
        Xarr[i] = Xarr.get(i,0)+1 
    
    for y in Y:
        if Xarr.get(y,0) > 0:
            answer+=y
            Xarr[y] -= 1
            
    answer = ''.join(sorted(answer,reverse=True))
    if answer == "": return "-1"
    if answer[0] == '0': return "0"

    return answer
    
