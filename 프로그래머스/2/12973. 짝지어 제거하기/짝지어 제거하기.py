def solution(s):
    idx = 0
    stack = []
    while(idx < len(s)):
        if stack and stack[-1] == s[idx]:
            stack.pop()
        else:
            stack.append(s[idx])
        idx+=1
    
    return 0 if len(stack)>0 else 1 