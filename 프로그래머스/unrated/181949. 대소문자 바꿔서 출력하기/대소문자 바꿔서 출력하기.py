str = input()
answer = ""

for char in str:
    if char.islower():
        answer += char.upper()
    else:
        answer += char.lower()

print(answer)