function solution(array) {
    let check = {};
    for(let i of array){
        if(check[i] === undefined){
            check[i] = 1;
        }else{
            check[i]++;
        };
    }
    console.log(check);
    let sorted = Object.entries(check).sort((a,b)=>b[1]-a[1]);
    
    if(sorted.length > 1 && sorted[0][1] == sorted[1][1]) return -1;
    else return Number(sorted[0][0]);
}