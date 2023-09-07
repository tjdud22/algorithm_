class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
      char[] charArray = myString.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A') {
                charArray[i] = 'B';
            } else if (charArray[i] == 'B') {
                charArray[i] = 'A';
            }
        }

        String replacedString = new String(charArray);
        
        if (replacedString.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}