class Solution {
    public String[] solution(String[] names) {
         int len = (int) Math.ceil((double) names.length / 5);
        String[] answer = new String[len];

        for (int i = 0, idx = 0; i < names.length; i += 5) {
            answer[idx++] = names[i];
        }

        return answer;
       
    }
}