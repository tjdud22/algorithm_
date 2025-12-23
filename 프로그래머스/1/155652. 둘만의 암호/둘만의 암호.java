import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        Set<Character> skipSet = new HashSet<>();
        for(char c : skip.toCharArray()){
            skipSet.add(c);
        }
        
        for(char c:s.toCharArray()){
            char current = c;
            int moved = 0;
            
            while(moved < index){
                current++;
                
                if(current > 'z'){
                    current = 'a';
                }
                
                if(skipSet.contains(current)){
                    continue;
                }
                
                moved++;
            }
            answer.append(current);
        }
        return answer.toString();
    }
}