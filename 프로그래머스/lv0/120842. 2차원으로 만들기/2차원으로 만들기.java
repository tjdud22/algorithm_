class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        int len = num_list.length / n;
        int idx = 0;
        int[][] answer = new int[len][n];
        for(int i =0; i<len; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }
}