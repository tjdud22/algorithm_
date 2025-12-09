def solution(food):
    answer = ''
    for i in range(len(food)):
        answer+=str(i)*(food[i]//2)
    answer+='0'
    return answer+answer[::-1][1::]