def solution(n):
    num = []
    while(n>0):
        num.append(str(n%3))
        n = n // 3
    return int(''.join(num),3)