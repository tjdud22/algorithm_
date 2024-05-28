class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
        int answer = 0;
        int previous = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z")) {
                answer -= previous;
            } else {
                previous = Integer.parseInt(str[i]);
                answer += previous;
            }
        }
        return answer;
    }
}