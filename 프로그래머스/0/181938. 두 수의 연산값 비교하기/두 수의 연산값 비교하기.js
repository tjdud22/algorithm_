function solution(a, b) {
     var answer = parseInt(`${a}${b}`) >= 2*parseInt(`${a}`*`${b}`) ? parseInt(`${a}${b}`) : 2*parseInt(`${a}`*`${b}`);
    return answer;
}