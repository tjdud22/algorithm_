function solution(my_string) {
    var answer = [];
    for (let i = 0; i < my_string.length; i++) {
        if (/\d/.test(my_string[i])) {  
            answer.push(parseInt(my_string[i]));  
        }
    }
    answer.sort((a, b) => a - b);  
    return answer;
}
