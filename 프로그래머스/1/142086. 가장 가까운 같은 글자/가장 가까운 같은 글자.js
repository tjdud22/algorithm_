function solution(s) {
    let answer = [];
    let arr = {};
    
    for(let i=0; i<s.length; i++){
        let char = s[i];
        if(arr[char] !== undefined){
            answer.push(i- arr[char]);
        }else{
            answer.push(-1);
        }
        arr[char] = i;
    }
    
    return answer;
}