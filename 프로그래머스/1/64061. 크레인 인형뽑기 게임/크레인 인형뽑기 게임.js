function solution(board, moves) {
    let answer = 0;
    const basket = [];
    for(let i=0; i<moves.length; i++){
        for(let j=0; j<board.length; j++){
            let choice = board[j][moves[i]-1];
            if(choice !== 0){
                if(basket[basket.length-1] == choice){
                    basket.pop();
                    board[j][moves[i]-1] = 0;
                    answer+=2;
                }else{
                    basket.push(choice);
                    board[j][moves[i]-1] = 0;
                }
                break;
            }
        }
    }
    return answer;
}