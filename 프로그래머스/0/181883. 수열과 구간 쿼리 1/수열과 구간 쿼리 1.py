def solution(arr, queries):
    for num in queries:
        for i in range(num[0],num[1]+1):
            arr[i] += 1
    return arr