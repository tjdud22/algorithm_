def solution(s):
    mid = len(s) // 2
    # 파이썬 삼항연산자 : 값1 if 조건 else 값2
    return s[mid] if len(s) % 2 == 1 else s[mid - 1:mid + 1] 
