def solution(my_str, n):
    answer = []
    cnt = 0
    start = 0
    end = n
    while(cnt<len(my_str)/n):
        cnt += 1
        answer.append(my_str[start:end])
        start +=n 
        end += n
    return answer