function solution(answers) {
    let answer = [];
    let one = [1,2,3,4,5];
    let two = [2,1,2,3,2,4,2,5];
    let three = [3,3,1,1,2,2,4,4,5,5];
    
    let oneCnt =0;
    let twoCnt =0;
    let threeCnt =0;
    
    for(let i=0; i<answers.length; i++){
        if(answers[i]===one[i%one.length]) oneCnt++;        
        if(answers[i]===two[i%two.length]) twoCnt++;        
        if(answers[i]===three[i%three.length]) threeCnt++;
    }
    
    let rank = [
  { count: oneCnt, value: 1 },
  { count: twoCnt, value: 2 },
  { count: threeCnt, value: 3 }
];
    
    rank.sort((a,b)=>b.count-a.count);
    
    let max = rank[0].count;
    
    for(let i of rank){
        if(i.count === max){
            answer.push(i.value);
        }
    }
    
    return answer;
}