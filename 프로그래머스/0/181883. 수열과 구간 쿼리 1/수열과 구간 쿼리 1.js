function solution(arr, queries) {
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<queries.length; j++){
            if(queries[j][0] <= i && i <= queries[j][1]){
                arr[i]++;
            }
        }
    }
    return arr;
}