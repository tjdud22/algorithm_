def solution(s):
    answer = 0
    for i in range(len(s)):
        rotation = s[i:] + s[:i]
        stack = []
        
        for ch in rotation:
            if ch in "({[":
                stack.append(ch)
            else:
                if not stack:
                    break
                    
                if(ch == ']' and stack[-1] == '[') or (ch == ')' and stack[-1] == '(') or (ch == '}' and stack[-1] == '{'):
                    stack.pop()
                else:
                    break
        else:
            if not stack:
                answer+=1
    return answer