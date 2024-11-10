class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            // 제곱수인 경우 (i의 제곱근이 정수이면 제곱수)
            if (Math.sqrt(i) == (int)Math.sqrt(i)) {
                answer -= i;  
            } else {
                answer += i;  
            }
        }
        
        return answer;
    }
}
