def solution(n):
    answer = 0
    for num in range(2,n+1):
        cnt = 0
        for j in range(1,int(num**0.5)+1):
            if num % j == 0:
                cnt+=1
            if cnt > 1:
                break
        if cnt == 1:
            answer+=1
    return answer