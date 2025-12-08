from itertools import combinations
def solution(numbers):
    arr = []
    for a,b in combinations(numbers,2):
        arr.append(a+b)
    answer = sorted(set(arr))
    return answer