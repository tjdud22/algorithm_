function solution(my_string, index_list) {
    let answer = '';
    for (var index of index_list) {
        answer += my_string.charAt(index);
    }
    return answer;
}