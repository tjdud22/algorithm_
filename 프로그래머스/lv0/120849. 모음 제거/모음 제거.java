class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
         for (char c : my_string.toCharArray()) {
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (c == vowel) {
                    isVowel = true;
                    break;
                }
            }
            
            if (!isVowel) {
                answer += c;
            }
        }
        return answer;
    }
}