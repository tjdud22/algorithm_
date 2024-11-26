import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 1. 학생들의 등수와 인덱스를 하나의 객체로 저장
        List<int[]> candidates = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) { 
                candidates.add(new int[]{rank[i], i}); // {등수, 인덱스}
            }
        }

        // 2. 등수를 기준으로 오름차순 정렬
        candidates.sort(Comparator.comparingInt(a -> a[0]));

        // 3. 상위 3명의 학생 선택
        int a = candidates.get(0)[1]; // 1순위 학생 번호
        int b = candidates.get(1)[1]; // 2순위 학생 번호
        int c = candidates.get(2)[1]; // 3순위 학생 번호

        // 4. 결과 계산
        return 10000 * a + 100 * b + c;
    }
}
