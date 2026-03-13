function solution(want, number, discount) {
    var answer = 0;
    const arr = {}
    for(let i=0; i<want.length; i++){
        arr[want[i]] = number[i];
    }
    
    for(let i=0; i<discount.length-9; i++){
        let temp = {...arr};
        let discount_slice = discount.slice(i,i+10);
        
        for(let j=0; j<discount_slice.length; j++){
            if(discount_slice[j] in temp){
                temp[discount_slice[j]] -= 1;
            
                if(temp[discount_slice[j]] === 0){
                delete temp[discount_slice[j]];
            }
        }
        }
        if(Object.keys(temp).length === 0){
            answer+=1;
        }
    }
    return answer;
}