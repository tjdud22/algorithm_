class Solution {
    public int solution(String s) {
        int answer = 0;
        String first = s.substring(0,1);
        int firstCnt = 0;
        int anotherCnt =0;
        
        String[] chars = s.split("");
        for(int i=0; i<chars.length; i++){
            String ch = chars[i];
            if(first.equals(ch)){
                firstCnt++;
            }else{
                anotherCnt++;
            }
            if(firstCnt == anotherCnt){
                answer++;
                firstCnt = 0;
                anotherCnt = 0;
                if(i<chars.length-1) first = chars[i+1];
            }
        }
        if(firstCnt !=0 || anotherCnt!=0) answer++;
        return answer;
    }
}