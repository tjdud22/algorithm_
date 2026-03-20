import heapq
# 가장 작은 값 2개를 계속 꺼내야 해서 heap 사용 (정렬 반복 방지 + 시간초과 해결)
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    
    while(len(scoville)>1):
        if(scoville[0] >= K):
            break
        answer+=1
        a = heapq.heappop(scoville)
        b = heapq.heappop(scoville)
    
        mix = a + b*2
        
        heapq.heappush(scoville,mix)
        
    return answer if scoville[0] >= K else -1