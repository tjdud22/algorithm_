class Solution {
    public String solution(String myString) {
        String answer = myString.toLowerCase();
        char [] charArray = answer.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        return new String(charArray);
    }
}