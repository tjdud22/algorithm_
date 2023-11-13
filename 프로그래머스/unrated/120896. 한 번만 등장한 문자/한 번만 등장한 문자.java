import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";

        int[] count = new int[26]; 

        for (char ch : s.toCharArray()) {
            count[ch-'a']++;
        }

        for (char ch : s.toCharArray()) {
            if (count[ch-'a'] == 1) {
                answer += ch;
            }
        }

        char[] resultArray = answer.toCharArray();
        Arrays.sort(resultArray);

        return new String(resultArray);
    }
}