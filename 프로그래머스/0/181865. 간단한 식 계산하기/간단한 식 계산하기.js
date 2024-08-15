function solution(binomial) {
    let parts = binomial.split(" ");
    let a = parseInt(parts[0]);
    let b = parseInt(parts[2]);
    
    return parts[1] === "+" ? a + b : parts[1] === "-" ? a - b : a * b;

}