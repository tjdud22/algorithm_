class Solution {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            sum += Character.getNumericValue(digit);
        }
        

        int remainder = sum % 9;
        return remainder;
    }
}