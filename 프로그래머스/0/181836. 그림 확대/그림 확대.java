import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> rows = new ArrayList<>();
        
        for (String line : picture) { 
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                for (int j = 0; j < k; j++) {
                    sb.append(c);
                }
            }
            String expandedLine = sb.toString();
            for (int j = 0; j < k; j++) {
                rows.add(expandedLine);
            }
        }
        
        return rows.toArray(new String[0]);
    }
}
