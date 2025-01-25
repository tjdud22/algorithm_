class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 중간값 계산
        int mid = total / num;
        
        // 시작값 계산: mid에서 num / 2 만큼 감소
        int start = mid - (num - 1) / 2;
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        
        return answer;
    }
}