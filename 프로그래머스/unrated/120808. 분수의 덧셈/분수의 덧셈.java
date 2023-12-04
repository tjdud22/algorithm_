class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int molecule = (numer1*denom2 + numer2*denom1);
        int denominator = denom1 * denom2;
        int gcd = findGCD(molecule, denominator);
        int[] answer = {molecule / gcd, denominator / gcd};
    return answer;
}

private int findGCD(int a, int b) {
    // 최대공약수 구하는 공식
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}