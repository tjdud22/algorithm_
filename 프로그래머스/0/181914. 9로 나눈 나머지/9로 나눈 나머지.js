function solution(number) {
    var answer = 0;
    var digits = number.toString().split('');
    for (var digit of digits) {
        answer += parseInt(digit);
    }
    return answer % 9;
}