def solution(balls, share):
    answer = 0
    numfac = 1
    ballsfac = 1
    sharefac = 1

    for i in range(1, balls + 1):
        ballsfac *= i

    for i in range(1, share + 1):
        sharefac *= i

    for i in range(1, balls - share + 1):
        numfac *= i

    answer = ballsfac // (sharefac * numfac)

    return answer