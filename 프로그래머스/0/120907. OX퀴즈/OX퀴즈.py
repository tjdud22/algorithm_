def solution(quiz):
    answer = []
    for q in quiz:
        a,ob,b,_,result = q.split(' ')
        a = int(a)
        b = int(b)
        result = int(result)
        if(ob == '+'):
            num = a + b
        else:
            num = a - b
        if(num == result):
            answer.append("O")
        else:
            answer.append("X")
    return answer