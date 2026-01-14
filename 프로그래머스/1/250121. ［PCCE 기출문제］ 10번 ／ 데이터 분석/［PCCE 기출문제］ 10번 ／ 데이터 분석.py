def solution(data, ext, val_ext, sort_by):
    answer = []
    group = []
    for code,date,maximum,remain in data:
        group.append({
            "code":code,
            "date":date,
            "maximum":maximum,
            "remain":remain
        })
    for g in group:
        if(int(g[ext]) < int(val_ext)):
            answer.append([g["code"],g["date"],g["maximum"],g["remain"]])
    key_idx = {
            "code":0,
            "date":1,
            "maximum":2,
            "remain":3
        }
    sorted_answer = sorted(answer,key=lambda x: x[key_idx[sort_by]])    
    return sorted_answer