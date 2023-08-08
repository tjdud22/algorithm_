class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum =0;
        int multi = 1;
        
        for(int i = 0; i<num_list.length; i++){
            if(num_list.length>=11){
                sum += num_list[i];
                answer = sum;}
            else{
                multi *= num_list[i];
              answer = multi;}
            
        }
        return answer;
    }
}