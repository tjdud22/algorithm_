def solution(i, j, k):
    answer = 0
    for num in range(i,j+1):
        temp = list(str(num))
        for t in temp:
            if t == str(k):
                answer += 1
                
    return answer