function solution(my_string) {
    let answer = new Array(52).fill(0);
    
    let arr = my_string.split("");
    for(let i of arr){
        if('A' <= i && i<='Z'){
            answer[i.charCodeAt(0) -65]++;
        }else{
            answer[i.charCodeAt(0) -97 +26 ]++;
        }
    }
    return answer;
}