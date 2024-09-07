function solution(numbers) {
    numbers.sort((a, b) => a - b);
    
    let n = numbers.length;
    return numbers[n - 1] * numbers[n - 2];
}
