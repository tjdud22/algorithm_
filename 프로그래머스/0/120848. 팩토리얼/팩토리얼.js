function solution(n) {
    let answer = 1;
    let fac = 1;

     while(n>=fac){
        answer++;
        fac *=answer;
        }
      
        return answer-1;
}