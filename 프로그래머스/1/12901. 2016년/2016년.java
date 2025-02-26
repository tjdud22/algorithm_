class Solution {
    public String solution(int a, int b) {
        String Week[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int Day[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum =0;
        
        for(int i=0; i<a-1; i++){
            sum += Day[i];
        }
        return Week[(((b-1 + sum) % 7))];
    }
}