import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int oneCnt = 0;
        int twoCnt = 0;
        int threeCnt = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i % one.length] ){
                oneCnt++;
            }
            if(answers[i] == two[i % two.length] ){
                twoCnt++;
            }
            if(answers[i] == three[i % three.length] ){
                threeCnt++;
            }
        }
        
        int maxScore = Math.max(oneCnt,Math.max(twoCnt,threeCnt));
        
        List<Integer> result = new ArrayList<>();
        if(maxScore == oneCnt) result.add(1);
        if(maxScore == twoCnt) result.add(2);
        if(maxScore == threeCnt) result.add(3);
        
        int [] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}