def solution(k, tangerine):
    answer = 0
    counter = {}
    
    for t in tangerine:
        if t in counter:
            counter[t] +=1
        else:
            counter[t] = 1
    freq = sorted(counter.values(),reverse=True)
    
    for f in freq:
        if k <= 0:
            break
        k-=f
        answer+=1
    return answer