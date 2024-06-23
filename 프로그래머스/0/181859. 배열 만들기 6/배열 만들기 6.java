import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
         ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (answer.size() == 0) {
                answer.add(arr[i]);
            } else {
                if (answer.get(answer.size() - 1) == arr[i]) {
                    answer.remove(answer.size() - 1);
                } else {
                    answer.add(arr[i]);
                }
            }
        }
        if (answer.size() == 0) {
            return new int[]{-1};
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}