function solution(arr) {
    let answer = 0;
    let prev = [];
    
    while(true){
    let temp = [];
        
    for(let i=0; i<arr.length; i++){
        let value = arr[i];
       if(value >=50 && value % 2 === 0){
           value /=2;
       }else if(value <50 && value % 2 === 1){
            value = value*2 +1;
        }
        temp.push(value);
    }
    
        if(JSON.stringify(arr) === JSON.stringify(temp)){
            break;
        }
        
        arr = temp;
        answer++;
    }
    return answer;
}