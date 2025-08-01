def solution(strArr):
    list = []
    for str in strArr:
        if 'ad' not in str:
            list.append(str)
    return list