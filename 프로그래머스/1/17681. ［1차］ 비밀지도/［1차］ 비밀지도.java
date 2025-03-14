import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
             // 1. 이진수 변환 + 자리수 n 맞추기 (앞에 0 채움)
            String str1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String str2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');

            // 2. 한 줄 만들기
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    line.append('#');
                } else {
                    line.append(' ');
                }
            }
            answer[i] = line.toString();
        }
        return answer;
    }
}