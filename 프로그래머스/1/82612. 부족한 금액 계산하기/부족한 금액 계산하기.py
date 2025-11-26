def solution(price, money, count):
    fee = sum(i for i in range(1,count+1))
    balance = money - price*fee
    if balance < 0:
        return abs(balance)
    else:
        return 0
