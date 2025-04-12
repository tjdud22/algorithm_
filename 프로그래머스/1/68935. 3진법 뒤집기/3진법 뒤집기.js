function solution(n) {
    let radix = n.toString(3);
    let reverse = radix.split('').reverse().join('');
    let answer = parseInt(reverse,3);
    return answer;
}