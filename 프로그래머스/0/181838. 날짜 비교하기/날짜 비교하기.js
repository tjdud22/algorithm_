function solution(date1, date2) {
    let answer = 0;
    for (let i = 0; i < date1.length; i++) {
        if (date1[i] < date2[i]) {
            answer = 1;
            break;
        } else if (date1[i] > date2[i]) {
            answer = 0;
            break;
        }
    }
    return answer;
}