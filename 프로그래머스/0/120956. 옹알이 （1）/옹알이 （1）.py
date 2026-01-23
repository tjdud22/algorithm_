def solution(babbling):
    answer = 0
    baby = ["aya", "ye", "woo", "ma"]
    
    for word in babbling:
        idx = 0
        while(idx < len(baby)):
            if word.startswith(baby[idx]):
                word = word[len(baby[idx]):]
                idx = 0
            else:
                idx+=1
        if len(word) == 0: answer+=1    
    return answer