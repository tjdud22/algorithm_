function solution(numbers) {
    let num = numbers.sort((a, b) => a - b);

    let max = num[num.length - 1] * num[num.length - 2];
    
    return Math.max(num[0]*num[1], max);
}
