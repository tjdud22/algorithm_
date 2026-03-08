def solution(clothes):
    dic = {}
    
    for c in clothes:
        dic[c[1]]=dic.get(c[1],0)+1
    
    num = 1
    for v in dic.values():
        num *= (v+1)
        
    return num-1