def solution(citations):
    answer = 0
    citations.sort(reverse=True)
    for idx,c in enumerate(citations):
        if c >= idx+1:
            answer = idx+1
        else:
            break
    return answer