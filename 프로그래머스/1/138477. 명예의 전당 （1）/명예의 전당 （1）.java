import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            temp.add(score[i]);
            temp.sort(Collections.reverseOrder());
            
            if(temp.size() > k){
                temp.remove(temp.size()-1);
            }
            
            answer.add(temp.get(temp.size()-1));
        }
        
        int result[] = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}