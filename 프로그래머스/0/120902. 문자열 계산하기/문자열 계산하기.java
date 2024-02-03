class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");

        for (int i = 0; i < str.length; i += 2) {
            int num = Integer.parseInt(str[i]);

            if (i > 0) {
                if (str[i - 1].equals("+")) {
                    answer += num;
                } else if (str[i - 1].equals("-")) {
                    answer -= num;
                }
            } else {
                answer = num;  
            }
        }
        return answer;
    }
}