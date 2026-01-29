def solution(num, total):
    x = -100
    while(True):
        acc=[x+i for i in range(num)]
        x+=1
        if(total == sum(acc)):
            return acc
            