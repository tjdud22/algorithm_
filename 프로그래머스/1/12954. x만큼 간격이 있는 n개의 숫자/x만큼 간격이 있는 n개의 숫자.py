def solution(x, n):
    if x>0:
        return [i for i in range(x,(x*n)+1,x)]
    elif x<0:
        return [i for i in range(x,(x*n)-1,x)]
    else:
        return [0]*n
