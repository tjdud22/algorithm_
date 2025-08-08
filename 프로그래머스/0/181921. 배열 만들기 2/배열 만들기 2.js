function solution(l, r) {
    let answer = [];
    for(let i = l; i<=r; i++){
        let str = i.toString();
        if([...str].every(ch => ch ==='5' || ch ==='0'))
            answer.push(i);
        
    }
    if(answer.length == 0) answer.push(-1);
    return answer;
}