import java.util.*;
class Solution {
    public int solution(int n) {
        String radix = Integer.toString(n,3);
        String reverse = "";
        for(int i=radix.length()-1; i>=0; i--){
            reverse+=radix.charAt(i);
        }
        int answer = Integer.parseInt(reverse,3);
        return answer;
    }
}