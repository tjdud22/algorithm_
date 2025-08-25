def solution(myString):
    for i in myString:
        if ord(i) - ord('l') < 0:
            myString = myString.replace(i,'l')
    return myString