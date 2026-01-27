def solution(numer1, denom1, numer2, denom2):
    numer3 = (numer1*denom2 + numer2*denom1)
    denom3 = denom1*denom2
    
    num = 1
    for i in range(2,min(numer3,denom3)+1):
        if numer3 % i == 0 and denom3 % i == 0:
            num = i
    
    return [numer3//num ,denom3//num ]