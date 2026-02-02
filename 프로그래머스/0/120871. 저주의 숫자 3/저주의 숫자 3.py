def solution(n):
    cnt = 0
    num = 1
    
    while(cnt < n):
        if num % 3 != 0 and str(num).count('3')==0:
            num+=1
            cnt+=1
        else:
            num+=1
    return num-1
