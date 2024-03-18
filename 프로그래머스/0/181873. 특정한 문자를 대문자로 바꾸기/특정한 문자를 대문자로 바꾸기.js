function solution(my_string, alp) {
    let answer = "";
    for (let i = 0; i < my_string.length; i++) {
        let currentChar = my_string.charAt(i);
        if (currentChar === alp) {
            answer += currentChar.toUpperCase();
        } else {
            answer += currentChar;
        }
    }
    return answer;
}