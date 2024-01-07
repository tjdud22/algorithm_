class Solution {
    public int solution(int[] sides) {
        int min = Math.min(sides[0],sides[1]);
        int answer = ( 2 * min ) -1;
        return answer;
    }
}