def solution(d, budget):
    answer = 0
    total = 0
    d.sort()
    for i in d:
        total += i
        if budget >= total:
            answer += 1
        else: 
            break
    return answer