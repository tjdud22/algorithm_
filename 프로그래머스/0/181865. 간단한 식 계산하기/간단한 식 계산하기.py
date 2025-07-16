def solution(binomial):
    arr = binomial.split(" ")
    answer = 0
    if arr[1] == '+':
        answer = int(arr[0]) + int(arr[2])
    elif arr[1] == '-':
        answer = int(arr[0]) - int(arr[2])
    else:
        answer = int(arr[0]) * int(arr[2])
    return answer