import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
      ArrayList<Integer> result = new ArrayList<>();
      
        for(int i=0; i<arr.length; i++){
            if(result.size() <k){
                if(!result.contains(arr[i])){
                result.add(arr[i]);
                }
            }
        }
        
        while(result.size()<k){
            result.add(-1);
        }
        
        int [] answer = new int[result.size()];
        for(int i =0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}