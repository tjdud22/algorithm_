def solution(my_string):
    str = my_string.split(' ')
    answer = int(str[0])
    
    for idx,num in enumerate(str):
        if num == '+':
            answer = answer + int(str[idx+1])
        elif num == '-':
            answer = answer - int(str[idx+1])
    return answer