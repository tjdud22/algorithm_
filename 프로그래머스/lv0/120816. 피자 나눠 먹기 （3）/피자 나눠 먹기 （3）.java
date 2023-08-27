class Solution {
    public int solution(int slice, int n) {
        int answer = n/slice;
        int answer1 = n%slice ;
        if(answer1>0){
        answer++;
        }
        return answer;
    }
}