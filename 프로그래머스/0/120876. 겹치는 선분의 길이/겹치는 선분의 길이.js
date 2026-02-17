function solution(lines) {
    var answer = 0;
    let arr = new Array(201).fill(0);
    for(let i=0; i<lines.length; i++){
        for(let j = lines[i][0]; j<lines[i][1]; j++){
            arr[100+j]+=1;
        }
    }
    
    for(let i=0; i<arr.length; i++){
        if(arr[i] >=2){
            answer+=1
        }
    }
    return answer;
}