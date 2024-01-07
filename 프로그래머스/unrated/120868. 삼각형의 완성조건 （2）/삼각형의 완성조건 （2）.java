class Solution {
    public int solution(int[] sides) {
        int min = 1001;
        for(int i=0; i<sides.length; i++){
            if(min>sides[i]){
                min = sides[i];
            }
        }
        int answer = ( 2 * min ) -1;
        return answer;
    }
}