class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int[] query : queries) {
            String b = "";
            for(int i = query[1]; i >=query[0]; i--) {
                b += my_string.charAt(i);
            }
            String a = my_string.substring(0, query[0]);
            String c = my_string.substring(query[1]+1);

            my_string = a + b + c;
        }

        return my_string;
    }
}