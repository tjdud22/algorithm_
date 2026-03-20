def solution(s):
    answer = []
    s = s[2:-2].split('},{')
    s.sort(key=len)
    
    for i in s:
        for num in map(int,i.split(',')):
            if num not in answer:
                answer.append(num)
    return answer