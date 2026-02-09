def solution(numbers, hand):
    answer = ''
    xy = [[1,3],[0,0],[1,0],[2,0],[0,1],[1,1],[2,1],[0,2],[1,2],[2,2]]
    positionL = [0,3]
    positionR = [2,3]
    
    for n in numbers:
        if n == 1 or n == 4 or n == 7:
            positionL = xy[n][0],xy[n][1]
            answer+="L"
        elif n == 3 or n == 6 or n == 9:
            positionR = xy[n][0],xy[n][1]
            answer+="R"
        elif n == 2 or n == 5 or n == 8 or n == 0:
            a = abs(positionL[0] - xy[n][0])+abs(positionL[1] - xy[n][1])
            b = abs(positionR[0] - xy[n][0])+abs(positionR[1] - xy[n][1])
            if a > b:
                positionR = xy[n][0],xy[n][1]
                answer+="R"
            elif a < b:
                positionL = xy[n][0],xy[n][1]
                answer+="L"
            else:
                if hand == "right":
                    positionR = xy[n][0],xy[n][1]
                    answer+="R"
                else:
                    positionL = xy[n][0],xy[n][1]
                    answer+="L"
                    
    return answer