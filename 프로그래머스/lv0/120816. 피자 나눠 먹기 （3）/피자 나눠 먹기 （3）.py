def solution(slice, n):
    answer = n // slice
    answer1 = n % slice
    if answer1 > 0:
        answer+=1
    return answer
    