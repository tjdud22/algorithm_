import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
     ArrayList<String> answerList = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                answerList.addAll(Arrays.asList(Arrays.copyOfRange(str_list, 0, i)));
                break;
            } else if (str_list[i].equals("r")) {
                answerList.addAll(Arrays.asList(Arrays.copyOfRange(str_list, i + 1, str_list.length)));
                break;
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);

        return answer;
    }
}
