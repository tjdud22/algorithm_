def solution(nums):
    answer = 0
    targets = []
    for i in range(len(nums)):
        for j in range(i+1,len(nums)):
            for k in range(j+1,len(nums)):
                targets.append(nums[i] + nums[j] + nums[k])
                
    for target in targets:
        cnt = 0
        for i in range(1,target+1):
            if target % i == 0:
                    cnt +=1
            if cnt > 2: break
        if cnt <= 2: answer+=1
        
    return answer