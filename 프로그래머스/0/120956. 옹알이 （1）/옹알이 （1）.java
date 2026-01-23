class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++){
            String word = babbling[i];
            boolean bool = true;
            while(bool){
                bool = false;
                for(int j=0; j<baby.length; j++){
                    if(word.startsWith(baby[j])){
                        word = word.substring(baby[j].length());
                        bool = true;
                        break;
                    }
                }
            }
            if(word.length() == 0){
                answer++;
            }
        }
        
        
        return answer;
    }
}