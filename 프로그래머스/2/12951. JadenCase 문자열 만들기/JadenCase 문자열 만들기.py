def solution(s):
    temp = s.lower().split(' ')
    answer = list(map(lambda x: x[0].upper()+x[1:] if x else '',temp))
    return ' '.join(answer)