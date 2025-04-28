function solution(N, stages) {
    var answer = [];
    let arr = [];
    let len = stages.length;
    for(let i=1; i<=N; i++){
        let cnt =0;
        for(let s of stages){
            if(i == s){
                cnt++;
            }
        }
        arr.push(cnt / len);
        len -=cnt;
    }
    for(let i=0; i<arr.length; i++){
        answer.push({stage:i+1,value:arr[i]});
    }
    answer.sort((a,b)=>b.value-a.value);
    let result = [];
    for(let item of answer){
        result.push(item.stage);
    }
    return result;
}