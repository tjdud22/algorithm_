import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int arr[] = new int[201];
        for(int i=0; i<lines.length; i++){
            for(int j=0; j<arr.length; j++){
                if(lines[i][0] +100 < j && lines[i][1] +100 >= j){
                    arr[j]++;
                }
            }
        }
        for(int i : arr){
            if(i>=2){
                answer++;
            }
        }
        return answer;
    }
}