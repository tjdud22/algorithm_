def solution(str_list):
    for idx,ch in enumerate(str_list):
        if ch == 'l':
            return str_list[:idx]
        elif ch == 'r':
            return str_list[idx+1:]
    return []
