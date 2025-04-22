import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer =0;
        int dice [] = {a,b,c,d};
        Arrays.sort(dice);
        
        Map<Integer,Integer>map = new HashMap<Integer,Integer>();

        for(int i=0; i<dice.length; i++){
            if(!map.containsKey(dice[i])){
                map.put(dice[i],map.getOrDefault(dice[i], 0) + 1);
            }else{
                map.put(dice[i],map.getOrDefault(dice[i], 0) + 1);
            }
        }
            System.out.print(map);
        if(map.size() == 1) answer = 1111 * dice[0];
        if(map.size() == 4) answer = dice[0];
        
        if(map.size() == 2){
            if(dice[1] == dice[2]){
                if(dice[0] != dice[1]){
                    answer = (int)(Math.pow((10 * dice[1] + dice[0]),2));
                }else{
                    answer = (int)(Math.pow((10 * dice[2] + dice[3]),2));
                }
            }else{
                answer = (dice[1] + dice[2]) * Math.abs(dice[1] - dice[2]);
            }
        } 
        if(map.size() == 3){
            for(int i=0; i<dice.length-1; i++){
                if(dice[i] == dice[i+1]){
                    if(i == 0) answer = dice[2] * dice[3];
                    if(i == 1) answer = dice[0] * dice[3];
                    if(i == 2) answer = dice[0] * dice[1];
                }
            }
            }
        System.out.print(dice[0]+" "+dice[1]+" "+dice[2]+" "+dice[3]);
        System.out.print(Math.pow((10 * dice[0] + dice[3]),2));    
        
        return answer;
    }
}