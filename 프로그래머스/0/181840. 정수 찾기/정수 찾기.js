function solution(num_list, n) {
    for(let i =0; i<num_list.length; i++){
        if(num_list.includes(n)){
            return 1;
        }
    }
    return 0;
}