def solution(s):
    str = list(s.lower())
    if str.count('p') == str.count('y'):
        return True
    else:
        return False
