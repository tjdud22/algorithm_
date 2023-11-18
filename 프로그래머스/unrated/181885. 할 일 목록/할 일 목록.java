import java.util.Arrays;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = new String[0];
        int idx = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[idx++] = todo_list[i];
            }
        }
        return answer;
    }
}