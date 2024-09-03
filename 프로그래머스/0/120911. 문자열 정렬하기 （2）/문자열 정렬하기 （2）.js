function solution(my_string) {
    return my_string
        .toLowerCase()     // 모든 문자를 소문자로 변환
        .split('')         // 문자 하나하나를 배열의 요소로 분리
        .sort()            // 알파벳 순서로 정렬
        .join('');         // 배열을 다시 문자열로 합침
}