function solution(spell, dic) {
    let answer = 2;
    for(let i of dic){
        let cnt = 0;
        for(let j of spell){
            if(i.includes(j)){
                cnt++;
            }
        }
        if(cnt === spell.length){
            answer = 1;
        }
    }
    return answer;
}