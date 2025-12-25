def solution(s, skip, index):
    answer = ''
    for ch in s:
        moved = 0
        while moved < index:
            ch = chr(ord(ch)+1)
            
            if ch > 'z': ch = 'a'
            
            if ch in skip:
                continue
            
            moved+=1
        answer+=ch        
        
    return answer