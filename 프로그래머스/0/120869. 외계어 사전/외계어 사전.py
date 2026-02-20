def solution(spell, dic):
    answer = 2
    for d in dic:
        cnt = 0
        for ch in spell:
            if d.count(ch) !=1:
                break
            else:
                cnt+=1
        if cnt == len(spell):
            answer = 1
    return answer