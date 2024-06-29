function solution(a, b) {
    var answer = parseInt(`${a}${b}`) >= parseInt(`${b}${a}`) ? parseInt(`${a}${b}`) : parseInt(`${b}${a}`)
    return answer;
}