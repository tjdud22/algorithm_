def solution(brown, yellow):
    
    for h in range(1,yellow+1):
        if yellow % h == 0:
            if (h+2)*2 + (yellow//h+2)*2 - 4 == brown:
                return [yellow//h+2,h+2]
