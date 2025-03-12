import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum<=budget){
                answer++;
            }
            if(sum >budget){
                break;
            }
        }
    
        return answer;
    }
}