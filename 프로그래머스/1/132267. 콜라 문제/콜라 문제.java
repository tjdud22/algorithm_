class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) { // 최소 빈 병 개수가 'a' 이상일 때만 반복
            int exchange = n / a; // 교환 가능한 콜라 병의 개수
            int remainder = n % a; // 교환 후 남는 병의 개수
            int newCoke = exchange * b; // 받은 콜라 병의 수
            
            answer += newCoke; // 받은 콜라 병 누적
            n = newCoke + remainder; // 새로운 빈 병 수 업데이트
        }
        
        return answer;
    }
}
