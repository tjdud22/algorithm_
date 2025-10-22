def solution(s):
    answer = ''
    str = list(s)
    
    for i in set(str):
        if s.count(i) == 1:
            answer+=i
    
    return ''.join(sorted(answer))
        
