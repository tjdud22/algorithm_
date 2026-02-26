def solution(s):
    answer = True
    stack = []
    
    idx = 0
    while(idx <len(s)):
        if s[idx] == '(':
            stack.append('(')
            idx+=1
        else:
            if stack and stack[-1] == '(':
                stack.pop()
                idx+=1
            else:
                answer = False
                break
    return False if len(stack) > 0 else answer