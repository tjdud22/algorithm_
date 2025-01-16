function solution(my_string) {
    var answer = '';
    for(let i=0; i<my_string.length; i++){
        let currentChar = my_string.charAt(i);
        if(!answer.includes(currentChar)){
            answer+=currentChar;
        }
    }
    return answer;
}