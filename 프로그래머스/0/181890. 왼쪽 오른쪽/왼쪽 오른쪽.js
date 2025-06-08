function solution(str_list) {
    var answer = [];
    let lIdx = "";
    let rIdx = "";
    
    for(let i=0; i<str_list.length; i++){
        if(str_list[i] === "l" || str_list[i] === "r"){
            if(str_list[i] === "l"){
                answer = str_list.slice(0,i);
                break;
            }else{
                answer = str_list.slice(i+1);
                break;
            }
        }
    }
    return answer;
}