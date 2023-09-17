def solution(n):
    i = 1
    answer = 0
    while i <= 100:
        if (n * i) % 6 == 0:
            answer = n * i // 6  
            break  
        else:
            i += 1  
    return answer