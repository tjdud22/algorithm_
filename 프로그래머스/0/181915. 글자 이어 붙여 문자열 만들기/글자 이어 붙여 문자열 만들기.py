def solution(my_string, index_list):
    answer = ''
    for i in index_list:
        for (idx,str) in enumerate(my_string):
            if i == idx:
                answer+=str
    return answer