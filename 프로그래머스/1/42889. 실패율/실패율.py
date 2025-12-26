def solution(N, stages):
    answer = {}
    total = len(stages)
    
    for stage in range(1,N+1):
        cnt = stages.count(stage)
        answer[stage] = cnt / total if total !=0 else 0
        total -= cnt
    return sorted(answer,key = lambda x: answer[x], reverse=True)