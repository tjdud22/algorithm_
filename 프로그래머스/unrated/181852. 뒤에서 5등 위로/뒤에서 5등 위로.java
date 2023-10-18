import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        
        int[] sortedArray = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(sortedArray);

        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = sortedArray[i];
        }

        return answer;
    }
}