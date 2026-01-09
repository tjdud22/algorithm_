def solution(nums):
    limit = len(nums)//2
    if len(set(nums))<limit:
        return len(set(nums))
    else: 
        return limit
