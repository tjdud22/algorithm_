class Solution {
    public int solution(int a, int b) {
         String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        int result1 = Integer.parseInt(strA + strB);
        int result2 = Integer.parseInt(strB + strA);
        
        if (result1 >= result2) {
            return result1;
        } else {
            return result2;
        }
    }
}