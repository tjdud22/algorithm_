function solution(myString) {
    const arrStr = myString.split('x');
    const answer = [];
    
    for (let i = 0; i < arrStr.length; i++) {
        answer.push(arrStr[i].length);
    }
    
    return answer;
}