class Solution {
    public String[] solution(String my_str, int n) {
       int len = my_str.length();
        String[] answer = new String[(len + n - 1) / n];
        int i = 0;
        int startIndex = 0;

        while (startIndex < len) {
            int endIndex = Math.min(startIndex + n, len);
            answer[i] = my_str.substring(startIndex, endIndex);
            startIndex += n;
            i++;
        }

        return answer;
    }
}