import math
def solution(progresses, speeds):
    answer = []
    workday = []
    for idx in range(len(progresses)):
        workday.append(math.ceil((100 - progresses[idx])/speeds[idx]))
    
    cnt = 0
    max = workday[0]
    for idx in range(len(workday)-1):
        cnt+=1
        if max < workday[idx+1]:
            max = workday[idx+1]
            answer.append(cnt)
            cnt = 0
    if max >= workday[-1]:
        answer.append(cnt+1)
    else:
        answer.append(1)
    return answer