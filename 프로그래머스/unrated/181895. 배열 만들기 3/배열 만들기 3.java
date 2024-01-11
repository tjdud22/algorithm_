import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = intervals[0][0]; i<= intervals[0][1]; i++){
        result.add(arr[i]);
            
        }
        for(int i = intervals[1][0]; i<= intervals[1][1]; i++){
        result.add(arr[i]);
            
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}