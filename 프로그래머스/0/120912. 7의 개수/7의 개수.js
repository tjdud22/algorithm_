function solution(array) {
    var answer = 0;
    for(let i =0; i<array.length; i++){
        let arr = String(array[i]).split('');
        for(let i of arr){
            if(i == '7') answer++;
        }
    }
    
    return answer;
}