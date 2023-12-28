class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sArr = s.split(" ");
        for(int i =sArr.length-1 ; i>=0; i--){
            if(sArr[i].equals("Z")){
               sArr[i-1] = "0";
            }else {
                answer += Integer.parseInt(sArr[i]);
            }
        }
      return answer;
    }
}