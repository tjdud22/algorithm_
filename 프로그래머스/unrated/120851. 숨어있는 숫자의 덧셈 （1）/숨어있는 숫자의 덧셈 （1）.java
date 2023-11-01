class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] parts = my_string.split("");
        for (String part : parts) {
            if (!part.isEmpty()) {
                int num = Integer.parseInt(part);
                answer += num;
            }
        }

        return answer;
    }
}