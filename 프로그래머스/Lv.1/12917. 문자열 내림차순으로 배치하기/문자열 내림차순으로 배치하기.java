import java.util.*;
class Solution {
    public String solution(String s) {
        char[] strArr = s.toCharArray();
        Arrays.sort(strArr);
        StringBuilder answer = new StringBuilder(new String(strArr));
        return answer.reverse().toString();
    }
}