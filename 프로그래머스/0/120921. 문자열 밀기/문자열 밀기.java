class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int len = A.length();

        for (int i = 0; i < len; i++) {
            if (A.equals(B)) {
                answer = i;
                break;
            }

            char lastChar = A.charAt(len - 1);
            A = lastChar + A.substring(0, len - 1);
        }

        return answer;
    }
}