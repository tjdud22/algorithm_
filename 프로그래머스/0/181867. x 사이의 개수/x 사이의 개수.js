function solution(myString) {
    let str = myString.split("x");
    let answer = [];
    for(let i =0; i<str.length; i++){
        answer.push(str[i].length);
    }
    return answer;
}