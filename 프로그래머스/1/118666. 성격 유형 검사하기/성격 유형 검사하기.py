def solution(survey, choices):
    answer = ''
    sheet = {
        "R": 0,"T": 0,
        "C": 0,"F": 0,
        "J": 0,"M": 0,
        "A": 0,"N": 0
    }
    
    for idx,category in enumerate(survey):
        if choices[idx] < 4:
            sheet[category[0]] += (4-choices[idx])
        elif choices[idx] > 4:
            sheet[category[1]] += (choices[idx]-4)
    pair = [("R","T"),("C","F"),("J","M"),("A","N")]
    
    for p in pair:
        if sheet[p[0]] >= sheet[p[1]]:
            answer+=p[0]
        else:
            answer+=p[1]
    
    return answer