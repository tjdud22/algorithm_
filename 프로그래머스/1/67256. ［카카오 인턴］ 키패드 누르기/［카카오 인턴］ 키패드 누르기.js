function solution(numbers, hand) {
    var answer = '';
    
    let xy = [[3,1],[0,0],[0,1],[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2],[3,0],[3,2]];
    
    let locationR = 10;
    let locationL = 11;
    
    for(let num of numbers){
        if(num === 1 || num === 4 || num === 7){
            answer+="L";
            locationL = num;
        }else if(num === 3 || num === 6 || num === 9){
            answer+="R";
            locationR = num;
        }else{
            let rX = Math.abs(xy[locationR][1] - xy[num][1]);
            let rY = Math.abs(xy[locationR][0] - xy[num][0]);
            
            let lX = Math.abs(xy[locationL][1] - xy[num][1]);
            let lY = Math.abs(xy[locationL][0] - xy[num][0]);
            if(rX + rY > lX + lY){
                answer+="L";
                locationL = num;
            }else if(rX + rY < lX + lY){
                answer+="R";
                locationR = num;
            }else{
                if(hand === "right"){
                    answer+="R";
                    locationR = num;
                }else{
                    answer+="L";
                    locationL = num;
                }
            }
        }
    }
    return answer;
}