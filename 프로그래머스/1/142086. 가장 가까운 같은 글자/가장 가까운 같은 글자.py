def solution(s):
    answer = []
    temp = {}
    for idx in range(len(s)):
        if s[idx] not in temp:
            answer.append(-1)
        else:
            answer.append(idx - temp[s[idx]])
        temp[s[idx]] = idx
    return answer