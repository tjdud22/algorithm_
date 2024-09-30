function solution(box, n) {
     let answer = 1;
        for(let i=0; i<box.length; i++){
            answer *=parseInt(box[i]/n);
        }
        return answer;
}