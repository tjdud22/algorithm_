function solution(polynomial) {
    var answer = '';
    let xSum = 0;
    let numSum =0;
    let poly = polynomial.split(" + ");
    
    for(let i=0; i<poly.length; i++){
        if(poly[i].includes("x")){
            let temp = poly[i].split("x")[0];
            
            if(temp === "") xSum += 1
            else xSum += parseInt(temp);
        }else{
            numSum += parseInt(poly[i]);
        }
        }
    
    if(numSum === 0){
        answer = xSum === 1 ? "x" : `${xSum}x`;    
    }else if(xSum === 0){
        answer = `${numSum}`;    
    }else{
        answer = xSum === 1 ? `x + ${numSum}` : `${xSum}x + ${numSum}`;
    }  
    return answer;
}
