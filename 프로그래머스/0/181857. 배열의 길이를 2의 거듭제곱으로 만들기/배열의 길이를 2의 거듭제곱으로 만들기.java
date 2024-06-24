import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
       int original = arr.length;
        int target = 1;
        while(target < original){
            target *= 2;
        }

        int[] answer = Arrays.copyOf(arr, target);

        return answer;
        
    }
}