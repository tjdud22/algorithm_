def solution(n):
    answer = 0
    num = n+1
    
    while(n < num):
        bin_num = bin(num)
        bin_n = bin(n)
        if bin_num.count('1') == bin_n.count('1'):
            answer = num
            break
        else:
            num+=1
    return answer