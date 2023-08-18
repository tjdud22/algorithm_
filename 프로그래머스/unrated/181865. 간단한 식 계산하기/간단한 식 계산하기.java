class Solution {
    public int solution(String binomial) {
   String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        
        return parts[1].equals("+") ? a + b : parts[1].equals("-") ? a - b : a * b;

    }
}