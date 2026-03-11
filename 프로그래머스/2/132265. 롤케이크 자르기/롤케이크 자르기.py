from collections import Counter
def solution(topping):
    answer = 0
    left = set()
    right = Counter(topping)
    
    for idx in range(0,len(topping)):
        left.add(topping[idx])
        if topping[idx] in right:
            right[topping[idx]] -= 1
            
        if right[topping[idx]] == 0:
            del right[topping[idx]]
        
        if len(left) == len(right):
            answer+=1
    return answer