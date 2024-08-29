function solution(arr, k) {
    let answer = [];
    for (let i of arr) {
        if (k % 2 == 1) {
            answer.push(i*k);
        } else {
            answer.push(i+k);
        }
    }
    return answer;
}