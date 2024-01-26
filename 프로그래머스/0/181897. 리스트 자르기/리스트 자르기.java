import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
       int[] answer = {};

        if (n == 1) {
            answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
        } else if (n == 2) {
            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        } else if (n == 3) {
            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
        } else if (n == 4) {
            int start = slicer[0];
            int end = slicer[1];
            int step = slicer[2];

            answer = new int[(end - start) / step + 1];
            int index = 0;
            
            for (int i = start; i <= end; i += step) {
                answer[index++] = num_list[i];
            }
        }
        return answer;
    }
}