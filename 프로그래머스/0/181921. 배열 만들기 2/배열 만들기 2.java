import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String numStr = Integer.toString(i);
            boolean valid = true;
            for (int j = 0; j < numStr.length(); j++) {
                char ch = numStr.charAt(j);
                if (ch != '0' && ch != '5') {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                answer.add(i);
            }
        }
        
        if (answer.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}