def solution(today, terms, privacies):
    answer = []
    today= today.split('.')
    ty,tm,td = map(int,today)
    today_total = (ty*12*28 + tm*28 + td)

    term = {}
    for t in terms:
        key,value = t.split(' ')
        term[key] = int(value)
        
    for idx,p in enumerate(privacies):
        key,value = p.split(' ')
        jy,jm,jd = map(int,key.split('.'))
        
        if today_total >= (jy*12*28 + jm*28 + jd + term[value]*28):
            answer.append(idx+1)
    
    return answer