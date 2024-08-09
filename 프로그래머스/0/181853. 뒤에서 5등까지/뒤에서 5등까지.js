function solution(num_list) {
    // num_list를 오름차순으로 정렬
    num_list.sort((a, b) => a - b);
    
    // 정렬된 리스트의 첫 5개의 요소를 슬라이스하여 반환
    let answer = num_list.slice(0, 5);
    
    return answer;
}