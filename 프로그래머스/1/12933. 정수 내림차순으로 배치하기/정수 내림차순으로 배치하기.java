import java.util.*;
class Solution {
    public long solution(long n) {
    String[] str= String.valueOf(n).split("");
        Arrays.sort(str,Collections.reverseOrder());
        return Long.parseLong(String.join("",str));
    }
}