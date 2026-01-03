def solution(name, yearning, photo):
    answer = []
    for pic in photo:
        total = 0
        for p in pic:
            for idx,n in enumerate(name):
                if n == p:
                    total += yearning[idx]
                else:
                    total += 0
        answer.append(total)
    return answer