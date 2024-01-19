class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strList = my_string.split("[^0-9]+");

        for (String str : strList) {
            if (!str.isEmpty()) {
                answer += Integer.parseInt(str);
            }
        }
        
        return answer;
    }
}