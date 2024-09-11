function solution(n) {
    let answer = n.toString().split("");
    let sum = 0;

    for (let i of answer) {
        sum += parseInt(i); 
    }

    return sum;
}