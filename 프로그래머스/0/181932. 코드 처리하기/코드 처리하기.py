def solution(code):
    answer = ''
    
    mode = 0
    
    for idx,str in enumerate(code):
        if mode == 0:
            if code[idx] != '1' and idx % 2 == 0:
                answer+=(code[idx])
            if code[idx] == '1' :
                mode = 1
        else:
            if code[idx] != '1' and idx % 2 == 1:
                answer+=(code[idx])
            if code[idx] == '1':
                mode = 0
    return 'EMPTY' if len(answer) == 0 else answer