import java.util.*;
class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String str = String.join("", arr);
        long answer = Long.parseLong(str);
        return answer;
    }
}