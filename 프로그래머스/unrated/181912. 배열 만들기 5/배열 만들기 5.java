import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int idx =0;
        for(int i = 0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
                if (num > k) {
                    answerList.add(num);
                }
        }
        // ArrayList를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
