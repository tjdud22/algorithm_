class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i =0; i<queries.length; i++){
            String b = "";
            for(int j=queries[i][1]; j>=queries[i][0]; j--){
                b+= my_string.charAt(j);
            }
             String a = my_string.substring(0,queries[i][0]);
             String c = my_string.substring(queries[i][1]+1);
            answer  = a + b + c;
            }
        return answer;
    }
}