function solution(s) {
    let count = {};
    for(let i=0; i<s.length; i++){
        let char = s[i];
        if(count[char]){
            count[char]++;
        }else{
            count[char] = 1;
        }
    }
    
    let answer = [];
    for(let key in count){
        if(count[key] === 1){
            answer.push(key);
        }
    }
    return answer.sort().join('');
}