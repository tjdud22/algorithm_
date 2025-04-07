function solution(s){
    var answer = false;
    
    let pCnt = 0;
    let yCnt = 0;

    for(let i of s.toLowerCase()){
        if(i == 'p'){
            pCnt++;
        }
        if(i == 'y'){
            yCnt++;
        }
    }
        if(pCnt == yCnt){
            answer = true;
        }
        if(pCnt == 0 && yCnt == 0){
            answer = true;
        }

    return answer;
}