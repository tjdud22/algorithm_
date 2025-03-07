import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            
            for (int j = 1; j * j <= i; j++) { 
                if (i % j == 0) {
                    cnt++; 
                    if (j != i / j) cnt++; // j와 i/j가 다르면 하나 더 증가
                }
                if (cnt > 2) break; 
            }
            
            if (cnt == 2) answer.add(i); 
        }
        
        return answer.size();
    }
}
