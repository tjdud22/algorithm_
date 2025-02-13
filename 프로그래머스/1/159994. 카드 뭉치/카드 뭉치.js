function solution(cards1, cards2, goal) {
    let idx1 =0, idx2 =0;
    for(let word of goal){
        if(idx1 < cards1.length && word === cards1[idx1]){
            idx1++;
        }else if(idx2 < cards2.length && word === cards2[idx2]){
            idx2++;
        }else{
            return "No";
        }
        
    }
    return "Yes";
}