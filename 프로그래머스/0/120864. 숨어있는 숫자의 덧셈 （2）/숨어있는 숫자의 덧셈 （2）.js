function solution(my_string) {
    let answer = 0;
    let strList = my_string.split(/[^0-9]+/);

    for (let str of strList) {
        if (str !== "") { 
            answer += parseInt(str);
        }
    }
    
    return answer;
}