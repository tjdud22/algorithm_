function solution(s) {
    let answer = [];
    let slice_s = s.slice(2,s.length-2).split('},{');
    slice_s.sort((a,b)=>a.length - b.length);
    
    for(let ch of slice_s){
        let nums = ch.split(',').map(Number);
        for(let num of nums){
            if(!answer.includes(num)){
                answer.push(num);
            }
        }
    }
    return answer;
}