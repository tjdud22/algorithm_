def solution(s):
    answer = []
    s = s.split('},{')
    s[0]=s[0][2:]
    s[-1] = s[-1][:-2]
    s = sorted(s,key=lambda x:len(x))
    
    for i in s:
        nums = list(map(int,i.split(',')))
        for num in nums:
            if num not in answer:
                answer.append(int(num))
    return answer