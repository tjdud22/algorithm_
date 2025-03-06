class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch != ' ') { 
                char base = Character.isLowerCase(ch) ? 'a' : 'A'; 
                char temp = (char) (base + (ch - base + n) % 26); 
                answer += temp;
            } else {
                answer += ' '; 
            }
        }
        return answer;
    }
}

    
