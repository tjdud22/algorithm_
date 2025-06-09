class Solution {
    // 최대공약수(GCD)를 구하는 함수
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // a/b가 유한소수인지 판별
    public int solution(int a, int b) {
        int g = gcd(a, b);  // 기약분수 만들기 위해 약분
        b /= g;             // b는 이제 기약분수의 분모

        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        return (b == 1) ? 1 : 2;
    }
}