import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6,1);
        map.put(5,2);
        map.put(4,3);
        map.put(3,4);
        map.put(2,5);
        map.put(1,6);
        map.put(0,6);
        
        int match =0;
        int unknown =0;
        for(int lotto : lottos){
            if(lotto == 0){
                unknown++;
            }
            for(int win : win_nums){
                if(lotto == win){
                    match++;
                    break;
                }
            }
        }
        
        int maxRank = map.getOrDefault(match + unknown, 6);  
        int minRank = map.getOrDefault(match, 6);  

        return new int[]{maxRank, minRank};
    }
}