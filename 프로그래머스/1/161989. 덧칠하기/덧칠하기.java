class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        for (int j = 0; j < section.length; ) {
            answer++; 
            int start = section[j]; 
            // 롤러가 덮을 수 있는 최대 구역까지 인덱스를 증가
            while (j < section.length && section[j] < start + m) {
                j++;
            }
        }
        
        return answer;
    }
}
