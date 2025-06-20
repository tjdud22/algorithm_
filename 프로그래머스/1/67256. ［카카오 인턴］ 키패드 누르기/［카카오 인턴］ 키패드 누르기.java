class Solution {
    public String solution(int[] numbers, String hand) {
        int [] leftHand = {3,0};
        int [] rightHand ={3,2};
        int[][] coordinate = {{3, 1},{0, 0},{0, 1},{0, 2},{1,0},{1, 1},{1, 2},{2, 0},{2, 1},{2, 2}};

	StringBuilder answer = new StringBuilder();        

        for(int num : numbers){
            if(isLeftNumber(num)){
                answer.append("L");
                leftHand = coordinate[num];
            }else if(isRightNumber(num)){
                answer.append("R");
                rightHand = coordinate[num];
            }else{
                int leftSum = getDist(coordinate[num],leftHand);
                int rightSum =  getDist(coordinate[num],rightHand);

              
               if(leftSum > rightSum){
                   answer.append("R");
                   rightHand = coordinate[num];
               }else if(leftSum < rightSum){
                   answer.append("L");
                   leftHand = coordinate[num];
               }else{
                   if(hand.equals("right")){
                       answer.append("R");
                       rightHand = coordinate[num];
                   }else{
                       answer.append("L");
                       leftHand = coordinate[num];
                   };
               }
            }
        }
        return answer.toString();
    }

    private boolean isLeftNumber(int num){
	    return num == 1 || num == 4 || num == 7;
    }

    private boolean isRightNumber(int num){
	    return num == 3 || num == 6 || num == 9;
    }

    private int getDist(int[] from, int[] to){
	    return Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);
    }
}