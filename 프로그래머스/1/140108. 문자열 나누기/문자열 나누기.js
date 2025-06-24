function solution(s) {
    let answer = 0;
    let first = "init";
    let firstCnt = 0;
    let anotherCnt = 0;
    
    let chars = s.split("");
    
    for(let ch of chars){
        if(first === "init"){
            first = ch;
            firstCnt++;
        }else if(first === ch){
            firstCnt++;
        }else{
            anotherCnt++;
        }
        
        if(firstCnt === anotherCnt){
            answer++;
            firstCnt = 0;
            anotherCnt = 0;
            first = "init";
        }
    }
    if(firstCnt !=0 || anotherCnt !=0) answer++;
    return answer;
}