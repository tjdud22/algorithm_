import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            boolean shouldDelete = false;
            
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    shouldDelete = true;
                    break;
                }
            }
            
            if (!shouldDelete) {
                answerList.add(arr[i]);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}