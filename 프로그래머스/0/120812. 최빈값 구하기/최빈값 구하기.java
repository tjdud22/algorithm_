class Solution {
    public int solution(int[] array) {
        // 배열에서 가장 큰 숫자만큼 빈도 저장을 위해 크기 설정
        int[] check = new int[1000]; // 제한사항에서 최대값이 1000 미만
        
        // 각 숫자의 빈도를 카운트
        for (int num : array) {
            check[num]++;
        }
        
        // 최빈값 및 빈도 비교를 위한 변수 초기화
        int maxFreq = 0;  // 최대 빈도
        int mode = -1;    // 최빈값
        boolean duplicate = false; // 최빈값 중복 여부
        
        for (int i = 0; i < check.length; i++) {
            if (check[i] > maxFreq) {
                maxFreq = check[i];
                mode = i;
                duplicate = false; // 새 최빈값 발견 시 중복 초기화
            } else if (check[i] == maxFreq && maxFreq > 0) {
                duplicate = true; // 동일한 빈도 발견 시 중복 표시
            }
        }
        
        // 최빈값이 여러 개라면 -1 반환
        return duplicate ? -1 : mode;
    }
}
