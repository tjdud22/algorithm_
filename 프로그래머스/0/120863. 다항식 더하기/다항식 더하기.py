def solution(polynomial):
    xSum=0
    numSum=0
    
    for p in polynomial.split(" + "):
        if p.endswith("x"):
            if p == "x":
                xSum += 1
            else:
                xSum += int(p[:-1])
        else:
            numSum += int(p)
    if xSum == 0:
        return str(numSum)
    elif numSum == 0:
        return 'x' if xSum == 1 else f"{xSum}x"
    else:
        return f"x + {numSum}" if xSum == 1 else f"{xSum}x + {numSum}"
        
