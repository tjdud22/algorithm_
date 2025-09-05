def solution(my_string, num1, num2):
    str = list(my_string)
    str[num1],str[num2] = str[num2],str[num1]
    return ''.join(str)