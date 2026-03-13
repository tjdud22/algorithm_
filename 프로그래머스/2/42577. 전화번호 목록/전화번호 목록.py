def solution(phone_book):
    answer = True
    phone_book.sort()
    idx = 1
    start = phone_book[0]
    while(idx < len(phone_book)):
        if phone_book[idx].startswith(start):
            answer = False
            break
        else:
            start = phone_book[idx]
            idx+=1
            
                
    return answer