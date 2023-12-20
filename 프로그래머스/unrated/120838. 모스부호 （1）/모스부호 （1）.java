import java.util.HashMap;
class Solution {
    public String solution(String letter) {
      HashMap<String, String> morse = new HashMap<String, String>();
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for (int i = 0; i < morseCodes.length; i++) {
            char alphabet = (char) ('a' + i);
            morse.put(String.valueOf(alphabet), morseCodes[i]);
        }

        StringBuilder answer = new StringBuilder();
        String[] words = letter.split(" ");

        for (String word : words) {
            if (morse.containsValue(word)) {
                for (String key : morse.keySet()) {
                    if (morse.get(key).equals(word)) {
                        answer.append(key);
                        break;
                    }
                }
            }
        }

        return answer.toString();
    }
}
