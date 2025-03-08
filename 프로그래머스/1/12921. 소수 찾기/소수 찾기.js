function solution(n) {
    let answer = [];

    for (let i = 1; i <= n; i++) {
        let cnt = 0;

        for (let j = 1; j * j <= i; j++) {
            if (i % j == 0) {
                cnt++;
                if (j !== i / j) { 
                    cnt++;
                }
            }
            
            if (cnt > 2) {
                break;
            }
        }

        if (cnt == 2) { 
            answer.push(i);
        }
    }

    return answer.length; 
}
