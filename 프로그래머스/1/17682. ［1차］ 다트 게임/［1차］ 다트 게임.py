def solution(dartResult):
    scores = []
    idx = 0
    
    while idx < len(dartResult):
        if dartResult[idx:idx+2] == "10":
            num = 10
            idx+=2 
        elif dartResult[idx].isdigit():
            num = int(dartResult[idx])
            idx+=1
            
        if dartResult[idx] == "D":
            num = num **2
        elif dartResult[idx] =="T":
            num = num **3
        elif dartResult[idx] == "S":
            num = num
        idx+=1
        
        if idx < len(dartResult) and dartResult[idx] in ("*","#"):
            if dartResult[idx] == "*":
                if scores:
                    scores[-1]*=2
                num *= 2
            else:
                num *= -1
            idx+=1
        scores.append(num)     
    return sum(scores)