def solution(n):
    x = 1
    while(n % x != 1):
        if n % x == 1: break
        else: x += 1
    return x
