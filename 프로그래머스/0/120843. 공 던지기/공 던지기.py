def solution(numbers, k):
    index = 0
    for i in range(1,k):
        index = index + 2 
        if index > len(numbers)-1:
            index = index % (len(numbers))
    return numbers[index]