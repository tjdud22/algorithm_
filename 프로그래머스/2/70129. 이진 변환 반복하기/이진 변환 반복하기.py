def solution(s):
    cnt1 = 0
    cnt2 = 0
    while(s != '1'):
        cnt2 += s.count('0')
        s = bin(s.count('1'))[2:]
        cnt1 += 1
    
    return [cnt1,cnt2]