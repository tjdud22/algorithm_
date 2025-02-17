import java.util.*;
class Solution {
    public int solution(String s) {
        HashMap<String, String> num = new HashMap<>();
        num.put("zero", "0");
        num.put("one", "1");
        num.put("two", "2");
        num.put("three", "3");
        num.put("four", "4");
        num.put("five", "5");
        num.put("six", "6");
        num.put("seven", "7");
        num.put("eight", "8");
        num.put("nine", "9");

        for(String key : num.keySet()){
            if(s.contains(key)){
                s = s.replace(key,num.get(key));
            }
        }
        
        return Integer.parseInt(s);
    }
}