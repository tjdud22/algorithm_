def solution(id_pw, db):
    answer = ''
    for id,pw in db:
        if id == id_pw[0] and pw == id_pw[1]:
            answer = 'login'
        elif id == id_pw[0] and pw != id_pw[1]:
            answer = 'wrong pw'
        elif id != id_pw[0] and pw != id_pw[1]:
            answer = 'fail'
    return answer