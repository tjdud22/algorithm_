def solution(array):
    answer = []
    max_num = max(array)
    for (idx,num) in enumerate(array):
        if max_num == num:
            answer = [num,idx]
    return answer