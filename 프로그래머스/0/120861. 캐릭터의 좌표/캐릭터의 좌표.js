function solution(keyinput, board) {
    let x = 0;
    let y = 0;
    
    let xLimit = Math.floor(board[0]/2);
    let yLimit = Math.floor(board[1]/2);
    
    for(let i=0; i<keyinput.length; i++){
            if(keyinput[i] === "left" && -xLimit < x) x--;
            if(keyinput[i] === "right"&& xLimit > x) x++;
            if(keyinput[i] === "down" && -yLimit < y) y--;
            if(keyinput[i] === "up" && yLimit > y) y++;
    }
    return [x,y];
}