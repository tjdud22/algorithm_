class Solution {
    public int[] solution(int[] num_list) {
        int num1=0;
        int num2=0;
       
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                num1++;
            }else{
                num2++;
            }
        }
     int[] answer = {num1,num2};
        return answer;
        
    }
}