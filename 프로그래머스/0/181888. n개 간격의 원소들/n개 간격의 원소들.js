function solution(num_list, n) {
     var answer = [];
    for (let i = 0; i < num_list.length / n; i++) {
        answer.push(0);
    }

    var idx = 0;
    for (let i = 0; i < num_list.length; i += n) {
        answer[idx] += num_list[i];
        idx++;
    }
    return answer;

}