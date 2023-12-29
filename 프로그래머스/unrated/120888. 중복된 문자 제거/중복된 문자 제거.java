class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (answer.indexOf(currentChar) == -1) {
                answer += currentChar;
            }
        }
        return answer;
    }
}