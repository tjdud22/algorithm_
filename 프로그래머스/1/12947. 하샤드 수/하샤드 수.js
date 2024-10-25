function solution(x) {
    let str = x.toString();
    let sum = 0;
    for (let i of str) {
        sum += Number(i); 
    }
    return x % sum === 0;
}