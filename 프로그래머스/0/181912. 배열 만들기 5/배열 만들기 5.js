function solution(intStrs, k, s, l) {
    var answer = [];
    for (let i of intStrs) {
        let num = parseInt(i.slice(s, s + l), 10);
        if (num > k) {
            answer.push(num);
        }
    }
    return answer;
}
