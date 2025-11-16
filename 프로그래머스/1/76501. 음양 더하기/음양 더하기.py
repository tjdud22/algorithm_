def solution(absolutes, signs):
    answer = 0
    for idx,i in enumerate(absolutes):
        if signs[idx] == True:
            answer += i
        else:
            answer -= i
    return answer