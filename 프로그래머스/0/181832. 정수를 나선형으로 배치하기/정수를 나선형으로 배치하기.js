function solution(n) {
    let answer = Array.from({length:n},()=>Array(n).fill(0));
    
        let x =0;
        let y =0;
        let num = 1;
    
        let dir = 0;
    
        while(num <=n*n){
            answer[x][y] = num++;
            
            if(dir === 0){
                if(y < n-1 && answer[x][y+1] === 0){
                    y++;
                }else{
                    dir = 1;
                    x++;
                }
            }else if(dir === 1){
                if(x < n-1 && answer[x+1][y] === 0){
                    x++;
                }else{
                    dir = 2;
                    y--;
                }
            }else if(dir === 2){
                if(y >= 1 && answer[x][y-1] === 0){
                    y--;
                }else{
                    dir = 3;
                    x--;
                }
            }else if(dir === 3){
                if(x >= 1 && answer[x-1][y] === 0){
                    x--;
                }else{
                    dir = 0;
                    y++;
                }
            }
            
            }
    return answer;
}