class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        
        int num=0;
        
        for(int i =start; i>=end; i--){
            answer[num++]=i;
        }
        
        return answer;
    }
}