class Solution {
    public int solution(int n, String control) {
     for (char answer : control.toCharArray()) {
            switch (answer) {
                case 'w':
                    n = n + 1;
                    break;
                case 's':
                    n = n - 1;
                    break;
                case 'd':
                    n = n + 10;
                    break;
                case 'a':
                    n = n - 10;
                    break;
            }
        }
        return n;
    }
}