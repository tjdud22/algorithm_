def solution(n, words):
    answer = [0,0]
    used = set()
    
    for idx in range(len(words)):
        if words[idx] in used:
            return [idx % n +1, idx // n +1]
        if idx > 0 and words[idx-1][-1] != words[idx][0]:
            return [idx % n +1,idx // n +1]
        used.add(words[idx]) 
        
    return answer