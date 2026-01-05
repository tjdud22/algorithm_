def solution(n, arr1, arr2):
    answer = []
    bin1 = []
    bin2=[]
    for i,j in zip(arr1,arr2):
        row1 = list(bin(i)[2:].zfill(n).replace("1","#").replace("0"," "))
        bin1.append(row1)
        row2 = list(bin(j)[2:].zfill(n).replace("1","#").replace("0"," "))
        bin2.append(row2)
        
    for i in range(n):
        row = ''
        for j in range(n):
            if bin1[i][j] == "#" or bin2[i][j] == "#":
                row+="#"
            else:
                row+=" "
        answer.append(row)
            
    return answer