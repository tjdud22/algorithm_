function solution(rank, attendance) {
    var answer = 0;
    let arr = [];

    for (let i = 0; i < rank.length; i++) {
        if (attendance[i]) {
            arr.push([rank[i], i]); // 등수와 학생 번호를 함께 저장
        }
    }

    arr.sort((a, b) => a[0] - b[0]); // 등수를 기준으로 정렬

    // 상위 3명의 학생 번호 추출
    const [a, b, c] = [arr[0][1], arr[1][1], arr[2][1]];

    // 결과 계산
    answer = 10000 * a + 100 * b + c;
    return answer;
}
