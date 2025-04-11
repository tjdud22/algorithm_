function solution(i, j, k) {
    var answer = 0;
    for(let n = i; n <=j; n++){
        let temp = n.toString().split('');
        for(let t of temp){
            if(t === k.toString()){
                answer++;
            }
        }
    }
    return answer;
}