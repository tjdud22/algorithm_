import re
def solution(n_str):
    return re.sub('^0+','',n_str)
