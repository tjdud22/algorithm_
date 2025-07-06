def solution(arr, idx):
    for i,a in enumerate(arr):
        if a == 1 and idx<=i:
            return i
    return -1 