function solution(arr, flag) {
    var answer = [];
     for (let i = 0; i < flag.length; i++) {
        if (flag[i]) {
            for (let j = 0; j < arr[i] * 2; j++) {
                answer.push(arr[i]);
            }
        } else {
            for (let j = 0; j < arr[i]; j++) {
                answer.splice(-1, 1); 
            }
        }
    }

    return answer;
}