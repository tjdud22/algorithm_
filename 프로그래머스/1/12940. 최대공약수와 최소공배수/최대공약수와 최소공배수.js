function solution(n, m) {
     // 최대공약수 구하기
    let gcd = 1; // 최대공약수를 저장할 변수
    for (let i = 1; i <= Math.min(n, m); i++) { // 두 수 중 작은 값까지만 반복
        if (n % i === 0 && m % i === 0) {
            gcd = i; // 나눠지는 값이 있으면 최대공약수 갱신
        }
    }

    // 최소공배수 구하기
    let lcm = (n * m) / gcd; // 공식: (n * m) / 최대공약수

    // 결과 반환
    return [gcd, lcm];
}