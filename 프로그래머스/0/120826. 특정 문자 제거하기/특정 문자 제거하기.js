function solution(my_string, letter) {
    var answer = '';
    let str = my_string.split("");
    for(let i of str){
       if(i != letter){
           answer +=i;
       } 
    }
    return answer;
}