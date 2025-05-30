function solution(score) {
    let avg = score.map(arr => (arr[0]+arr[1])/2);
    let sorted = [...avg].sort((a,b)=>b-a);
    console.log(avg);
    
    let rank = 1;
    let temp = {};
    for(let i=0; i<sorted.length; i++){
        if(sorted[i] == sorted[i-1]){
            temp[sorted[i]] = temp[sorted[i-1]];
        }else{
            temp[sorted[i]] = rank;
        }
        rank++;
    }
    console.log(temp);
    
    let answer = avg.map(arr => temp[arr]);
    return answer;
}