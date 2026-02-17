def solution(lines):
    answer = 0
    arr = [0]*201
    
    for start,end in lines:
        for i in range(start,end):
            arr[i+100] +=1
        
    for i in arr:
        if i >=2:
            answer+=1
    return answer