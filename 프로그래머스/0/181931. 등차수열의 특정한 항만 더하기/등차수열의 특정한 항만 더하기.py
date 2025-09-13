def solution(a, d, included):
    answer = 0
    arr = [ i for i in range(a,a+d*len(included),d)]
    for idx,bool in enumerate(included):
        print(bool)
        print(idx)
        if bool:
            answer += arr[idx]
    return answer