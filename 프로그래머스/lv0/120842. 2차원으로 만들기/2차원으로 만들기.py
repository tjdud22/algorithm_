def solution(num_list, n):
    length = len(num_list) // n
    answer = [[0] * n for _ in range(length)] 
    idx = 0 

    for i in range(length):
        for j in range(n):
            answer[i][j] = num_list[idx]
            idx += 1

    return answer