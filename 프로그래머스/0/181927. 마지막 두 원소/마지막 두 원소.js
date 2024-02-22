function solution(num_list) {
    var answer = new Array(num_list.length + 1);
    
    for (var i = 0; i < num_list.length; i++) {
        answer[i] = num_list[i];
    }
    
    if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
        answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
    } else {
        answer[num_list.length] = 2 * num_list[num_list.length - 1];
    }

    return answer;
}