function solution(arr) {
    var answer = [[]];
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr[i].length; j++){
            if(arr.length > arr[i].length){
                while(arr.length !== arr[i].length){
                    arr[i].push(0);
                }
            }else{
                while(arr.length !== arr[i].length){
                    arr.push(new Array(arr.length).fill(0));
                }
            }
        }
    }
    return arr;
}