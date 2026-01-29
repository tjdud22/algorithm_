def solution(num, total):
    center = total//num
    if num % 2 == 0:
        return [i for i in range(center-(num//2-1),center+(num//2+1))]
    else:
        return [i for i in range(center-(num//2),center+(num//2+1))]