class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        //처음 위치 left:*(10),right:#(11)
        int leftHand = 10;
        int rightHand = 11;
        int[][] coordinate = {{0, 3},{-1, 0},{0, 0},{1, 0},{-1, 1},{0, 1},{1, 1},{-1, 2},{0, 2},{1, 2},{-1,3},{1,3}};
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer +="L";
                leftHand = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer +="R";
                rightHand = numbers[i];
            }else{
                int leftSum = Math.abs(coordinate[numbers[i]][0] - coordinate[leftHand][0]) + Math.abs(coordinate[numbers[i]][1] - coordinate[leftHand][1]);
                int rightSum = Math.abs(coordinate[numbers[i]][0] - coordinate[rightHand][0]) + Math.abs(coordinate[numbers[i]][1] - coordinate[rightHand][1]);
                
                
               if(leftSum > rightSum){
                   answer +="R";
                   rightHand = numbers[i];
               }else if(leftSum < rightSum){
                   answer +="L";
                   leftHand = numbers[i];
               }else{
                   if(hand.equals("right")){
                       answer +="R";
                       rightHand = numbers[i];
                   }else{
                       answer +="L";
                       leftHand = numbers[i];
                   };
               }
            }
        }
        return answer;
    }
}