function solution(n, m, section) {
    let cnt = 1;
    let start = section[0];
    
    for(let i=0; i<section.length; i++){
        if(start + m <= section[i]){
            cnt++;
            start = section[i];
        }
    }
    return cnt;
}