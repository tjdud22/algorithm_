function solution(s, skip, index) {
    var answer = '';
    let skipArr = skip.split('');
    
    for(let i=0; i<s.length; i++){
        let ch = s[i];
        let moved = 0;

        while(moved<index){
            ch = String.fromCharCode(ch.charCodeAt(0)+1);
            
            if(ch >'z') ch = 'a';
            
            if(skipArr.includes(ch)){
                continue;
            }

            moved++;
        }
        answer+=ch
    }
    
    return answer;
}