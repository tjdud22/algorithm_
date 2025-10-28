function solution(n) {
    let answer = [];
    for(let i=2; i<=n; i++){
        if(n % i == 0){
            let cnt = 0
            for(let j=2; j<=i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt <=1) answer.push(i); 
        } 
    }
    console.log(answer)
    return answer;
}