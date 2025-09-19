from itertools import repeat

def solution(arr, flag):
    answer = []
    for idx,bool in enumerate(flag):
        if int(bool) == 1:
            for i in range(arr[idx]*2):
                answer.append(arr[idx])
        else:
            answer = answer[:-(arr[idx])]
    return answer