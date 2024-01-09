import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> multiple = new ArrayList<Integer>();
        for(int i =0; i<numbers.length; i++){
            for(int j=0; j<i; j++){
                multiple.add(numbers[i]*numbers[j]);
            }
        }
        int answer = Collections.max(multiple); 
        return answer;
    }
}