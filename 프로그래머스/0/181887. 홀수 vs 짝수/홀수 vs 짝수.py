def solution(num_list):
    sum1 = 0
    sum2 = 0
    for i,num in enumerate(num_list):
        if i % 2 == 0:
            sum1 += num
        else:
            sum2 += num
    return sum1 if sum1 >= sum2 else sum2