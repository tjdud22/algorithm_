class Solution {
    public int solution(int[][] dots) {
        int length1 = 0;
        int length2 = 0;
        
        for(int i=1; i<dots.length; i++){
            int temp1 = dots[0][0];
            if(temp1 != dots[i][0]){
                length1 = Math.abs(dots[0][0] - dots[i][0]);
            }
            
            int temp2 = dots[0][1];
            if(temp2 != dots[i][1]){
                length2 = Math.abs(dots[0][1] - dots[i][1]);
            }
        }

        return length1 * length2;
    }
}