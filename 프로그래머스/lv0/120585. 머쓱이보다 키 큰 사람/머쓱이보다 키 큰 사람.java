class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int arry : array){
            
            if(height<arry){
                answer++;
            }
            
            
        }
        
        
        return answer;
    }
}