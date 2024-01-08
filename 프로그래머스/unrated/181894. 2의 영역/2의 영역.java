class Solution {
    public int[] solution(int[] arr) {
        
        int firstIdx = -1;
        int lastIdx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIdx = i;
                break;
            }
        }
        
        for (int i = arr.length-1; i>=0; i--) {
            if (arr[i] == 2) {
                lastIdx = i;
                break;
            }
        }
        
        if(firstIdx ==-1 || lastIdx==-1 ){
          return new int[]{-1};
        }
        
        int[] answer = new int[lastIdx-firstIdx+1];
        
        for(int i = firstIdx; i<=lastIdx; i++){
            answer[i-firstIdx] = arr[i];
        }
        return answer;
    }
}