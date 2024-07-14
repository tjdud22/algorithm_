function solution(number) {
    let answer = 0;
    let digits = number.toString().split('');
    for (let digit of digits) {
        answer += parseInt(digit);
    }
    return answer % 9;
}