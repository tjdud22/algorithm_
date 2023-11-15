class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order); 
        char[] c = orderStr.toCharArray(); 
        for (char ch : c) {
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        return answer;
    }
}