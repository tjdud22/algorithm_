function solution(num_str) {
    let answer = 0;
    for (let i = 0; i < num_str.length; i++) {
        let s = num_str.charAt(i);
        let num = parseInt(s);
        answer += num;
    }
    return answer;
}