function solution(k, tangerine) {
    let answer = 0;
    let total = 0;
    let arr = {}
    for(let i=0; i<tangerine.length; i++){
            arr[tangerine[i]] = (arr[tangerine[i]]||0)+1;
        }
    let counts = Object.values(arr).sort((a,b)=>b-a);
    for(let count of counts){
        answer+=1;
        total += count;
        if(k <= total) break;            
    }
    return answer;
}