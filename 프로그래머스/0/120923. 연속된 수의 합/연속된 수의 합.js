function solution(num, total) {
    let start = Math.floor(total / num - (num - 1) / 2);
    let answer = [];
    for (let i = 0; i < num; i++) {
        answer.push(start + i);
    }
    return answer;
}
