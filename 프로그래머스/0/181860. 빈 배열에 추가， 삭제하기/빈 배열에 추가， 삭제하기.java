import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
         ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    result.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                        result.remove(result.size()-1);
                }
            }
        }

        int answer[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}