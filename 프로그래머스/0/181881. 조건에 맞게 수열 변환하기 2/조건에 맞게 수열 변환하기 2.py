def solution(arr):
    answer = 0
    before = arr[:]
    while(True):
        after = []
        
        for num in before:
            if (num >= 50 and num % 2 == 0):
                after.append(num // 2)
            elif (num < 50 and num % 2 == 1):
                after.append(num * 2 + 1)
            else:
                after.append(num)
                
        if before == after: 
            break
            
        answer += 1
        before = after[:]
        
    return answer