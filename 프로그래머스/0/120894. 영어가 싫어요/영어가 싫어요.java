import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        HashMap<String,String> alphabet = new HashMap<>();
        alphabet.put("zero","0");
        alphabet.put("one","1");
        alphabet.put("two","2");
        alphabet.put("three","3");
        alphabet.put("four","4");
        alphabet.put("five","5");
        alphabet.put("six","6");
        alphabet.put("seven","7");
        alphabet.put("eight","8");
        alphabet.put("nine","9");
        
        // 입력 문자열을 순차적으로 숫자로 변환
        for (String key : alphabet.keySet()) {
            numbers = numbers.replace(key, alphabet.get(key));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }
}