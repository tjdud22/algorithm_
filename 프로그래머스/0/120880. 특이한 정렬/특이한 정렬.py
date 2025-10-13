def solution(numlist, n):
    arr = []
    for i in numlist:
        arr.append([i,abs(n-i)])
    arr.sort(key = lambda x: (x[1],-x[0]))
    return [i[0]for i in arr]