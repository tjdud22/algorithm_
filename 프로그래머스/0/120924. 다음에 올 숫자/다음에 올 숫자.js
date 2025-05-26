function solution(common) {
    let answer = 0;
    let a = common[common.length-1];
    let b = common[common.length-2];
    let c = common[common.length-3];
    
    if(a-b === b-c){
        answer = a + (a-b);
    }else if(a/b === b/c){
        answer = a*(a/b);
    }
    return answer;
}