function solution(sides) {
    let answer = 0;
    let maxLen = Math.max(sides[0],sides[1]);    
    let minLen = Math.min(sides[0],sides[1]);
    
    for(let i=maxLen+1; i<maxLen+minLen; i++){
            answer++;
    }
    
    
    for(let i=maxLen - minLen+1; i<=maxLen; i++){
            answer++;
    }
    return answer;
}