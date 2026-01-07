def solution(number, limit, power):
    answer = 0
    count = []
    for i in range(1,number+1):
        cnt = 0
        for j in range(1,int(i**0.5)+1):
            if i % j == 0:
                if j * j == i:
                    cnt += 1
                else:
                    cnt +=2
        if cnt > limit:
            answer += power
        else:
            answer += cnt
                
    return answer