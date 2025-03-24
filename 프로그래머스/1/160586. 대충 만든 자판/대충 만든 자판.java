import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String,Integer> map = new HashMap<>();
        for(int i =0; i<keymap.length; i++){
            char[] str = keymap[i].toCharArray();
            for(int j=0; j<str.length; j++){
                if (!map.containsKey(String.valueOf(str[j])) || j+1 < map.get(String.valueOf(str[j]))) {
                            System.out.println(String.valueOf(str[j]));
                    System.out.println(j+1);
    map.put(String.valueOf(str[j]), j+1);
            }
            
            }
        }
        
        for(int i=0; i<targets.length; i++){
            char[] str = targets[i].toCharArray();
            for(int j=0; j<str.length; j++){
                if(map.containsKey(String.valueOf(str[j]))){
                    answer[i] += map.get(String.valueOf(str[j]));
                }else{
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}