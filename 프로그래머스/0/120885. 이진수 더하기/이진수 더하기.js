function solution(bin1, bin2) {
    // 1. 이진 문자열을 십진수로 변환
    const decimal1 = parseInt(bin1, 2);
    const decimal2 = parseInt(bin2, 2);
    
    // 2. 합산 후 이진 문자열로 변환
    const sum = decimal1 + decimal2;
    return sum.toString(2);
}