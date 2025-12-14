def solution(s, n):
    answer = ''
    for i in s:
        if i == " ":
            answer+=" "
        elif ord(i) >=97:
            answer+=chr(ord('a') + (ord(i)-ord('a')+n)%26)
        else: 
            answer+=chr(ord('A') + (ord(i)-ord('A')+n)%26)
    return answer