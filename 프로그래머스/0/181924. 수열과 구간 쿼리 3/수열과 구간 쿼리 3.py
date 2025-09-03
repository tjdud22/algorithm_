def solution(arr, queries):
    for i in queries:
        idx1 = i[0]
        idx2 = i[1]
        temp = arr[idx1]
        arr[idx1] = arr[idx2]
        arr[idx2] = temp
    return arr