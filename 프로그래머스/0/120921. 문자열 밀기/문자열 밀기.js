function solution(A, B) {
    let answer = 0;
    for(let i=0; i<A.length; i++){
        if(A === B){
            break;
        }
        A = A.slice(-1)+A.slice(0,-1);
        answer++;
    }
    return answer>=A.length ? -1 : answer;
}