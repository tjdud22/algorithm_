class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = ""; 
        for (int i = 0; i < my_string.length(); i++) {
            boolean isIdxFound = false; 
            for (int j : indices) {
                if (i == j) {
                    isIdxFound = true; 
                }
            }

            if (!isIdxFound) {
                answer += my_string.charAt(i);
            }
        }

        return answer; 
        }
    }
