import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", ""); 
        
        String[] num = my_string.split("");
        int[]answer = new int[num.length];
        
        for (int i = 0; i < num.length; i++) {
        	answer[i] = Integer.parseInt(num[i]);
		}
        Arrays.sort(answer);
        
    	return answer;
    }
}