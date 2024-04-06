function solution(n_str) {
    var answer = '';
    for(let i =0; i<n_str.length; i++){
        if(n_str.charAt(i) != 0){
            answer = n_str.substring(i);
            break;
        }
        
    }
    return answer;
}