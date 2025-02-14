class Solution {
    public String solution(String s) {
        char[] str = s.toCharArray();
        int len = str.length;
        
        if (len % 2 == 0) {
            return String.valueOf(str[len / 2 - 1]) + str[len / 2];
        } else {
            return String.valueOf(str[len / 2]);
        }
    }
}