class Solution {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            if ((answer * 7) >= n) {
                return answer;
            }
            answer++;
        }
    }
}