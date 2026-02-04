def solution(rank, attendance):
    arr = []
    
    for idx,num in enumerate(rank):
        if attendance[idx]:
            arr.append((rank[idx],idx))
            
    arr.sort()
    
    a = arr[0][1]
    b = arr[1][1]
    c = arr[2][1]
    
    return 10000 * a + 100 * b + c