import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        
        ArrayList<String> answer = new ArrayList<>();
        
        for (String i : str) {
            if (!i.isEmpty()) {
                answer.add(i);
            }
        }
        
        String[] result = answer.toArray(new String[0]);
        Arrays.sort(result);
        return result;
    }
}