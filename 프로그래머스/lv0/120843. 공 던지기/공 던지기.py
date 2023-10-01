def solution(numbers, k):
    answer = 0
    idx = 0
    for i in range(k):
        answer = numbers[idx]
        idx = (idx + 2) % len(numbers)
    return answer