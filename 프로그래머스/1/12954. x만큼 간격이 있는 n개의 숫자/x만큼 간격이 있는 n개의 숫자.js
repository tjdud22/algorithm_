function solution(x, n) {
    var answer = [];
    while(answer.length < n){
        answer.push(x*(answer.length+1));
    }
    return answer;
}