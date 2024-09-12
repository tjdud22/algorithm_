
function solution(my_string) {
    let str = my_string.split("");  
    let vowels = ['a', 'e', 'i', 'o', 'u'];  
    let answer = ""; 
    
    for (let i of str) {
        if (!vowels.includes(i)) {  
            answer += i;  
        }
    }
    
    return answer;  
}
