def solution(l, r):
    answer = []
    for i in range(l,r+1):
        if all(ch == '5' or ch == '0' for ch in str(i)):
            answer.append(i);
    return [-1] if len(answer) == 0 else answer;