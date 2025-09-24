def solution(s):
    answer = 0
    beforeNum = 0
    arr = s.split(' ')
    for i in arr:
        if i == 'Z':
            answer -= beforeNum
        else:
            beforeNum = int(i)
            answer += beforeNum
    return answer
    