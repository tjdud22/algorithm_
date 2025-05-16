function solution(number, limit, power) {
    let answer = 0;
    
    for(let i=1; i<=number; i++){
        let cnt = 0;
        for(let j=1; j*j<=i; j++){
            if(i % j ==0){
            if( j == i / j ){
                cnt++;
            }else{
                cnt+=2;
            }
            }
        }
        if(cnt > limit){
            answer += power;
        }else{
            answer += cnt;
        }
    }
    return answer;
}