def solution(arr1, arr2):
    answer = []
    for a1 in arr1:
        row = []
        for j in range(len(arr2[0])):
            total = 0
            for i in range(len(a1)):
                total += a1[i]*arr2[i][j]
            row.append(total)
        answer.append(row)
    return answer