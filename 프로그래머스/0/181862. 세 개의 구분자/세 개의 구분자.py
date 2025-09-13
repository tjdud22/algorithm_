import re
def solution(myStr):
    parts = re.split('[abc]',myStr)
    answer = list(p for p in parts if p)
    return answer if answer else ["EMPTY"]