def solution(keymap, targets):
    answer = []
    for target in targets:
        target = list(target)
        minCnt = 0
        for ch in target:
            temp = []
            for key in keymap:
                if ch in key:
                    temp.append(key.index(ch)+1)
            if temp:
                minCnt += min(temp)
            else:
                minCnt = -1
                break
        answer.append(minCnt)
    return answer