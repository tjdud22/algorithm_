class Solution {
    public int[] solution(int n) {
        int[] temp = new int[1000]; 
        temp[0] = n;
        int count = 1; 

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            temp[count] = n;
            count++;
        }

        int[] answer = new int[count];
        System.arraycopy(temp, 0, answer, 0, count); 
     
        return answer;
    }
}