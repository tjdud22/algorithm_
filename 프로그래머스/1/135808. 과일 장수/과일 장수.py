def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    for idx in range(0,len(score)-m+1,m):
        answer += score[idx+m-1]*m
    return answer