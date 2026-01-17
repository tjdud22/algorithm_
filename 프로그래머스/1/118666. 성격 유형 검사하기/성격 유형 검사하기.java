import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        map.put("RT",0);
        map.put("CF",0);
        map.put("JM",0);
        map.put("AN",0);
        
        for(int i=0; i<choices.length; i++){
            if(map.containsKey(survey[i])){
                map.put(survey[i],map.get(survey[i]) + (choices[i]-4));
            }else{
                String reversed = new StringBuilder(survey[i]).reverse().toString();
                map.put(reversed,map.get(reversed)+(4-choices[i]));
            }
        }
        
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if(value <= 0){
                answer += key.substring(0,1);
            }else{
                answer += key.substring(1,2);
            }
        }
        
        return answer;
    }
}