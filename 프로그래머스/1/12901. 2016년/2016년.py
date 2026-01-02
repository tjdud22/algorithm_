def solution(a, b):
    Week = ["FRI","SAT","SUN","MON","TUE","WED","THU"]
    Day = [31,29,31,30,31,30,31,31,30,31,30,31]
    
    date = b-1
    for i in range(a-1):
        date+=Day[i]
    return Week[date % 7]