def solution(num_list):
    count1 = 0
    count2 = 0
    for num in num_list:
        if(num%2==0):
            count1+=1
        else:
            count2+=1
    answer = [count1,count2]
    return answer