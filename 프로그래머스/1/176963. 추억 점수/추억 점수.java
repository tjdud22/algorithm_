import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        List<Integer> result = new ArrayList<>();
        
        HashMap<String,Integer> score = new HashMap<>();
        for(int i=0; i<name.length; i++){
            score.put(name[i],yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                //NullPointerException 방지
                sum += score.getOrDefault(photo[i][j], 0);
            }
            result.add(sum);
        }
        
        int []answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}