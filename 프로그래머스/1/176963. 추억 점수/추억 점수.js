function solution(name, yearning, photo) {
    var answer = Array(photo.length).fill(0);
    for(let i =0; i<photo.length; i++){
        for(let j=0; j<photo[i].length; j++){
            for(let k=0; k<name.length; k++){
                if(photo[i][j] === name[k]){
                    answer[i] += yearning[k];
                }
            }
        }
    }
    return answer;
}