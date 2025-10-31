def solution(arr):
    row = 0
    for i in range(len(arr)):
        row = max(row,len(arr[i]))
    size = max(len(arr),row)
    
    if len(arr) < size:
        for _ in range(size - len(arr)): 
            arr.append([0] * size)
    
    for i in range(len(arr)):
        if len(arr[i]) < size:
            arr[i]+= [0]*(size-len(arr[i]))
    return arr