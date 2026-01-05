def solution(n, arr1, arr2):
    answer = []
    bin1 = []
    bin2=[]
    for i in arr1:
        row = list(bin(i)[2:].zfill(n).replace("1","#").replace("0"," "))
        bin1.append(row)
    for j in arr2:
        row = list(bin(j)[2:].zfill(n).replace("1","#").replace("0"," "))
        bin2.append(row)
        
    for i in range(n):
        row = ''
        for j in range(n):
            if bin1[i][j] == "#" or bin2[i][j] == "#":
                row+="#"
            else:
                row+=" "
        answer.append(row)
            
    return answer