import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> lastChar = new HashMap<>(); 
        
        for(int i =0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            
            //key가 있는지 확인(같은 문자 등장한 적 있는지 확인)
                if(lastChar.containsKey(currentChar)){
                    //특정 키(문자)에 대한 값(인덱스) 담기
                    int lastIdx = lastChar.get(currentChar);
                    answer[i] = i-lastIdx;
                }else{
                    answer[i] = -1;
                    
                
            }
            //현재 문자의 인덱스 저장
            lastChar.put(currentChar,i);
        }
        
        return answer;
    }
}