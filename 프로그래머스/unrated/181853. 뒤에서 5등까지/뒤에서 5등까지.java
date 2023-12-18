import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        if(num_list.length<5){
            answer = num_list.clone();
        }else{
            answer = new int[5];
            Arrays.sort(num_list);
            for(int i=0; i<answer.length; i++){
              answer[i] = num_list[i];
            }
            
        }
        return answer;
    }
}