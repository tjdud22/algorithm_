import math
def solution(progresses, speeds):
    answer = []
    workday = []
    for p,s in zip(progresses,speeds):
        workday.append(math.ceil((100 - p)/s))
    
    cnt = 0
    max_day = workday[0]
    for idx in range(len(workday)-1):
        cnt+=1
        if max_day < workday[idx+1]:
            answer.append(cnt)
            max_day = workday[idx+1]
            cnt = 0
    answer.append(cnt+1)
    return answer