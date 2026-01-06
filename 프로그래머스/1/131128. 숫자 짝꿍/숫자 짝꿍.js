function solution(X, Y) {
    let Xarr = X.split("").sort();
    let Yarr = Y.split("").sort();
    
    let i = 0;
    let j = 0;
    let answer = [];
    
    while(i < Xarr.length && j < Yarr.length){
        if(Xarr[i] == Yarr[j]){
            answer.push(Xarr[i]);
            i++;
            j++;
        }else if(Xarr[i] < Yarr[j]){
            i++;
        }else{
            j++;
        }
    }
    
    if(answer.length === 0){return "-1";}
    
    answer.sort((a,b)=>b-a);
    
    if(answer[0] === "0"){return "0";}
    
    return answer.join("");
}