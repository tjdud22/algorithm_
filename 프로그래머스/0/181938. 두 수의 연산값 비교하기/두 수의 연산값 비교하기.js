function solution(a, b) {
     var answer = (Number(`${a}${b}`) >= 2 * a * b ) ? Number(`${a}${b}`) : 2 * a * b;
    return answer;
}