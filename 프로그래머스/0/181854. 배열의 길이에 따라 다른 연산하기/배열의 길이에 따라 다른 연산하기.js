function solution(arr, n) {
    var answer = [];
    for (let i = 0; i < arr.length; i++) {
        answer[i] = arr[i]; 
        if (arr.length % 2 == 1 && i % 2 == 0) {
            answer[i] += n;
        } else if (arr.length % 2 == 0 && i % 2 == 1) {
            answer[i] += n;
        }
    }
    
    return answer;
}