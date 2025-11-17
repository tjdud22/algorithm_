def solution(s):
    cnt1 = 0
    cnt2 = 0
    str = list(s.lower())
    print(str)
    for i in str:
        if i == 'p':
            cnt1 +=1
        if i == 'y':
            cnt2 +=1
    if cnt1 == cnt2:
        return True
    if 'p'and'y' not in str:
        return False
    else:
        return False
