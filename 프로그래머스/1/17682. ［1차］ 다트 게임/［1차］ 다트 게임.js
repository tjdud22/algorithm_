function solution(dartResult) {
    let answer = 0;
    let prevScore = 0;
    let curScore = 0;
    
    let dart = dartResult.split('');
    for(let i=0; i<dart.length; i++){
        if(!isNaN(Number(dart[i]))){
            if(dart[i] === '1' && dart[i+1] === '0'){
                curScore = 10;
                i++;
            }else{
                curScore = Number(dart[i]);
            }
            continue;
        }
        
        if(dart[i] === "S") curScore = curScore**1;
        if(dart[i] === "D") curScore = curScore**2;
        if(dart[i] === "T") curScore = curScore**3;
        
        
        if(dart[i] === "S" || dart[i] === "D" || dart[i] === "T"){
            if(dart[i+1] === "*"){
                curScore *= 2;
                answer += prevScore;  
                answer += curScore;   
                prevScore = curScore;
                i++;
                continue;
            }else if(dart[i+1] === "#"){
                curScore *= (-1);
                answer += curScore;
                prevScore = curScore;
                i++;
                continue;
            }
        }

        answer += curScore;
        prevScore = curScore;
    }
    return answer;
}