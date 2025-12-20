def solution(lottos, win_nums):
    answer = 0
    cnt = 0
    rank = [6,6,5,4,3,2,1]
    for i in lottos:
        if i in win_nums:
            answer+=1
        elif i == 0:
            cnt += 1
    return [rank[answer+cnt],rank[answer]]