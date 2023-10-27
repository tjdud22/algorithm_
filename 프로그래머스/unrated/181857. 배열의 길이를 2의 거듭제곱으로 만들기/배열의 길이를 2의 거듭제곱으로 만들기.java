import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int originalLength = arr.length;
        int targetLength = 1;

        while (targetLength < originalLength) {
            targetLength *= 2;
        }

        int[] answer = Arrays.copyOf(arr, targetLength);

        return answer;
    }
}