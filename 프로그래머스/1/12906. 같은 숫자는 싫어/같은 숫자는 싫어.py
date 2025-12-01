def solution(arr):
    answer = []
    for idx,num in enumerate(arr):
        if idx < len(arr)-1:
            if arr[idx] != arr[idx+1]:
                answer.append(arr[idx])
    answer.append(arr[len(arr)-1])            
    return answer