class Solution {
    public int[] solution(int[] array) {
 
        int max = 0;
        int maxIdx = -1;
        for(int i = 0 ; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
                maxIdx = i;
            }
        }
        int[] answer = {max,maxIdx};
        return answer;
    }
}