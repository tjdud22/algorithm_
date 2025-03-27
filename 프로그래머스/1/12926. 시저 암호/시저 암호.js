function solution(s, n) {
    var answer = '';
    for(let i=0; i<s.length; i++){
        if(s.charAt(i) == ' '){
            answer+=' ';
        }else if(s.charAt(i) >='A' && s.charAt(i) <='Z'){
            answer += String.fromCharCode((s.charAt(i).charCodeAt(0) - 'A'.charCodeAt(0) + n) % 26 + 'A'.charCodeAt(0));
        }else{
            answer += String.fromCharCode((s.charAt(i).charCodeAt(0) - 'a'.charCodeAt(0) + n) % 26 + 'a'.charCodeAt(0));
        }
    }
    return answer;
}