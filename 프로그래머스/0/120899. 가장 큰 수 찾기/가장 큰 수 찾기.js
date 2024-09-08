function solution(array) {
    // 가장 큰 수 찾기
    const maxNum = Math.max(...array);
    
    // 그 수의 인덱스 찾기
    const index = array.indexOf(maxNum);
    
    // 결과를 배열로 반환
    return [maxNum, index];
}
