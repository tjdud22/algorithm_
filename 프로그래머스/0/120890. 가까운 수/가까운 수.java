import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int[] result = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            result[i] = Math.abs(array[i] - n);
        }
        
        int minDiff = result[0];
        int answer = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (result[i] < minDiff) {
                minDiff = result[i];
                answer = array[i];
            } else if (result[i] == minDiff && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}