def solution(sides):
    sortedSides = sorted(sides)
    return 1 if sortedSides[2] < sortedSides[0] + sortedSides[1] else 2