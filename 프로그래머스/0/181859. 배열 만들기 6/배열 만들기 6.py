def solution(arr):
    answer = []
    for i in range(len(arr)):
        if len(answer)>0 and arr[i] == answer[-1]: 
            answer.pop()
        else: answer.append(arr[i])
    return [-1] if len(answer) == 0 else answer