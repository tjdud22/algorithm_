class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i=0; i<box.length; i++){
            answer *=(int)box[i]/n;
        }
        return answer;
    }
}