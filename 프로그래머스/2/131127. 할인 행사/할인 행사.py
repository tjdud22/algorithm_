def solution(want, number, discount):
    answer = 0
    idx = 0
    while(idx <= len(discount)-10):
        arr = discount[idx:idx+10]
        check = False
        for i in range(len(want)):
            if arr.count(want[i]) >= number[i]:
                check = True
            else:
                check = False
                break
        if check: answer+=1
        idx+=1
            
    return answer