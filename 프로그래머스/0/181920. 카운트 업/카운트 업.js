function solution(start_num, end_num) {
     let answer = [];
    for(let i= start_num; i<=end_num; i++){
        answer[i- start_num] = i;
    }
    return answer;
}