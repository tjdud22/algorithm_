class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int numP = 0;
        int numY = 0;

        for (char ch : s.toCharArray()) {
            if (Character.toLowerCase(ch) == 'p') {
                numP++;
            }

            if (Character.toLowerCase(ch) == 'y') {
                numY++;
            }
        }

        if (numP != numY) {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}