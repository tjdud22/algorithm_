def solution(hp):
    answer = 0
    generals = hp // 5
    hp %= 5
    soldiers = hp // 3
    hp %= 3
    answer = generals + soldiers + hp
    
    
    return answer