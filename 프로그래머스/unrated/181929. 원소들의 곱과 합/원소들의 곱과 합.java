class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < num_list.length; i++) {
            num1 += num_list[i];
            num2 *= num_list[i];
        }

        int num3 = num1 * num1;

        answer = num2 < num3 ? 1 : 0;

        return answer;
    }
}