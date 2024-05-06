import java.util.*;
class Solution {
    public int solution(String[] strArr) {
       int[] answer = new int[30];
        
        for (int i = 0; i < strArr.length; i++) {
            answer[strArr[i].length() - 1]++;
        }
        
        Arrays.sort(answer);
        
        return answer[answer.length - 1];
    }
}