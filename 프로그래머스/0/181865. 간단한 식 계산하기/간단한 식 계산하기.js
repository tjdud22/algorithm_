function solution(binomial) {
    const parts = binomial.split(" ");
    const a = parseInt(parts[0]);
    const b = parseInt(parts[2]);
    
    return parts[1] === "+" ? a + b : parts[1] === "-" ? a - b : a * b;

}