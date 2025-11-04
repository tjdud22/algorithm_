def solution(A, B):
    answer = -1
    cnt = 0
    while(cnt <=len(A)):
        if(A == B):
            answer = cnt
            break
        else:
            cnt+=1
            A = A[len(A)-1]+A[:len(A)-1]
            print(A)
    return answer