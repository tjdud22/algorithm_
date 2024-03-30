function solution(num_list) {
   let answer = 0;
    let answer1 = 1;
    for (let i = 0; i < num_list.length; i++) {
        if (num_list.length >= 11) {
            answer += num_list[i];
        } else {
            answer1 *= num_list[i];
        }
    }
    return num_list.length >= 11 ? answer : answer1;
}