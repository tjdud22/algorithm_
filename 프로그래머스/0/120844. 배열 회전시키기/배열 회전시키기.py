def solution(numbers, direction):
    answer = [i for i in range(len(numbers))]
    for (idx,num) in enumerate(numbers):
        if direction == 'right':
            if idx == len(numbers)-1:
                answer[0] = num
            else:
                answer[idx+1] = num
        else:
            if idx == 0:
                answer[len(answer)-1] = num
            else:
                answer[idx-1] = num    
    return answer