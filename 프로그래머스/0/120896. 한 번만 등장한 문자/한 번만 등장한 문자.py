def solution(s):
    answer = ''
    
    str = list(s)
    check = set(str)
    
    for i in check:
        cnt = 0
        for num in str:
            if num == i:
                cnt += 1
        if cnt <=1:
            answer += i
    
    return ''.join(sorted(answer))
        
