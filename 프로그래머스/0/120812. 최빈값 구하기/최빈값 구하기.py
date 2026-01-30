def solution(array):
    cnt = {}
    for i in array:
        cnt[i] = cnt.get(i,0)+1
        
    max_cnt = max(cnt.values())
        
    if list(cnt.values()).count(max_cnt) >1:
        return -1
            
    for k,v in cnt.items():
        if v == max_cnt:
            return k