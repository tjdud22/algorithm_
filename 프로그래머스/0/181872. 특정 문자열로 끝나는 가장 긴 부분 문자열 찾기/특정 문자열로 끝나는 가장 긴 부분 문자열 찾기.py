def solution(myString, pat):
    return myString[:myString.rindex(pat)] if len(myString) == myString.rindex(pat) else myString[:myString.rindex(pat)+len(pat)] 
