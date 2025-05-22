function solution(a, b, c, d) {
    let dice = [a,b,c,d];
    let count = {};
    
    dice.forEach((num)=>{
        count[num] = (count[num] || 0) + 1;
    });
    
    const keys = Object.keys(count).map(Number).sort((a,b)=>a-b);
    
    if(keys.length === 1){
        return keys[0] * 1111;
    }
    
    if(keys.length === 2){
        const p = keys[0];
        const q = keys[1];
        if(count[p] === 3){
            return Math.pow(10* p + q ,2);
        }else if(count[q] === 3){
            return Math.pow(10* q + p ,2)
        }else{
            return (p + q) * Math.abs(p - q);
        }
    }
    
    if(keys.length === 3){
        const p = keys[0];
        const q = keys[1];
        const r = keys[2];
       if(count[p] === 2){
            return q*r;
        }else if(count[q] === 2){
            return p*r;
        }else if(count[r] === 2){
            return p*q;
        }
    }
    
   if(keys.length === 4){
       return keys[0];
   }
}