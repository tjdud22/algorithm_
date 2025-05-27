function solution(board) {
    let answer = 0;
    let dx = [0,1,1,1,0,-1,-1,-1];
    let dy = [1,1,0,-1,-1,-1,0,1];
    
    for(let i=0; i<board.length; i++){
        for(let j=0; j<board[i].length; j++){
            if(board[i][j] === 1){
                for(let k =0; k<dx.length; k++){
                    if( i+dx[k] >=0 && i+dx[k] <board.length && j+dy[k] >=0 && j+dy[k] <board.length && board[i+dx[k]][j+dy[k]] === 0){
                        board[i+dx[k]][j+dy[k]] = 2;
                    }
                }
                
            }
        }
    }    
    
    for(let i=0; i<board.length; i++){
        for(let j=0; j<board[i].length; j++){
            if(board[i][j] === 0){
                answer++;
            }
        }
        
    }
    return answer;
}