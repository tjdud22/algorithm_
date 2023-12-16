import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
         ArrayList<String> answerList = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    answerList.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    answerList.add(str_list[j]);
                }
                break;
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);

        return answer;
    }
}
