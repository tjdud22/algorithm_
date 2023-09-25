def solution(n, k):
    answer = 0
    servings = n // 10; 
        
    yakitoriCost = n * 12000
    drinkCost = k * 2000
        
    if servings > 0:
        drinkCost -= servings * 2000

    answer = yakitoriCost + drinkCost
    return answer