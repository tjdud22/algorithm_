function solution(food) {
    let answer = '';
    for(let i=1; i<food.length; i++){
        for(let j=1; j<=food[i]/2; j++){
            answer+=i;
        }
    }
    answer+="0";
    
    for(let i = answer.length-2; i>=0; i--){
        answer+=(answer[i]);
    }
    return answer;
}