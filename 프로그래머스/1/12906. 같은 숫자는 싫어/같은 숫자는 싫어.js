function solution(arr){
    var answer = [];

    let num = -1;
    for(let i of arr){
        if(num != i){
            answer.push(i);
            num = i;
        };
    }
    return answer;
}