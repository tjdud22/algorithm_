def solution(answers):
    answer = []
    scores= [0,0,0]
    
    one = [1,2,3,4,5]
    two = [2,1,2,3,2,4,2,5]
    three = [3,3,1,1,2,2,4,4,5,5]
    
    for idx,an in enumerate(answers):
        if an == one[idx % len(one)]:
            scores[0]+=1
        if an == two[idx % len(two)]:
            scores[1]+=1
        if an == three[idx % len(three)]:
            scores[2]+=1 
            
    max_score = max(scores)
        
    for idx,score in enumerate(scores):
        if score == max_score:
            answer.append(idx+1)
    return answer