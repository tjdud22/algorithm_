def solution(my_string):
    answer = ''
    vowels = ['a', 'e', 'i', 'o', 'u']
    
    for c in my_string:
        is_vowel = False
        
        for vowel in vowels:
            if c == vowel:
                is_vowel = True
                break
        
        if not is_vowel:
            answer += c
    
    return answer