def solution(n):
    answer = []
    for i in range(0,n):
        row = []
        for j in range(0,n):
            if i == j:
                row.append(1)
            else:
                row.append(0)
        answer.append(row)
    return answer