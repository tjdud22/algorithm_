function solution(keymap, targets) {
    var answer = [];
    let minCnt = {};
    
    for(let i=0; i<keymap.length; i++){
        let key = keymap[i].split("");
        for(let j=0; j<key.length; j++){
            if(minCnt[key[j]] === undefined || minCnt[key[j]] > j+1){
                minCnt[key[j]] = j+1;
            }
        }
    }
        
        for(let i=0; i<targets.length; i++){
            let target = targets[i].split("");
            let sum =0;
            
            for(let char of target){
            if(minCnt[char] === undefined){
                sum = -1;
                break;
            }else{
                sum += minCnt[char];
            }
            }
                answer.push(sum);
        }
    return answer;
}