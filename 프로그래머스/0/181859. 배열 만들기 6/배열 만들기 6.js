function solution(arr) {
    let answer = [];
    let i=0;
    while(i<arr.length){
        if(answer.length == 0){
            answer.push(arr[i++]);
        }else if(answer.length !=0 && answer[answer.length-1] == arr[i]){
            answer.pop();
            i++;
        }else if(answer.length !=0 && answer[answer.length-1] != arr[i]){
            answer.push(arr[i++]);
        }
    }
    
    if(answer.length == 0) return [-1];
    return answer;
}