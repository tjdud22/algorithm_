def solution(score):
    arr = []
    for idx,s in enumerate(score):
        avg = (s[0]+s[1])/2
        arr.append((avg,idx))
    arr.sort(reverse = True)
    print(arr)
    
    ranks = [0]*len(score)
    prev_score = None
    prev_rank = 0
    for rank,(avg,idx) in enumerate(arr):
        if avg != prev_score:
            prev_score = avg
            prev_rank = rank+1
        ranks[idx] = prev_rank
    return ranks