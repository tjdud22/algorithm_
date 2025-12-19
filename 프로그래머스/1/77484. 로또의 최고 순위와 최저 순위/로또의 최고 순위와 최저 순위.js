function solution(lottos, win_nums) {
    let answer = 0;
    let cnt = 0
    for (let i=0; i<lottos.length; i++){
        if(win_nums.includes(lottos[i])){
            answer++;
        }else if(lottos[i] == 0){
            cnt++;
        }
    }
    let rank = {6:1,5:2,4:3,3:4,2:5,1:6,0:6};
    
    return [rank[answer+cnt],rank[answer]];
}