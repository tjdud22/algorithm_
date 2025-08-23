def solution(num, k):
    for (idx,i) in enumerate(str(num),start=1):
        if i==str(k):
            return idx
    return -1
