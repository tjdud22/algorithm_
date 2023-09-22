class Solution {
    public String solution(int age) {
        String answer = "";
        while (age > 0) {
        int num = age % 10;
        char alphabet = (char) ('a' + num);
        answer = alphabet + answer;
        age /= 10;
    }
        return answer;
    }
}