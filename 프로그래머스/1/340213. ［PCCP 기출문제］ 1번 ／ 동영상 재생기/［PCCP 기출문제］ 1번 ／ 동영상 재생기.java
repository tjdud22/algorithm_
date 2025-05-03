class Solution {
    
    public int parseTime(String time){
        String part[] = time.split(":");
        return Integer.parseInt(part[0])*60 + Integer.parseInt(part[1]);
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int posNum = parseTime(pos);
        int startNum = parseTime(op_start);
        int endNum = parseTime(op_end);
        int videoNum = parseTime(video_len);
        
        for(int i=0; i<commands.length; i++){
            if(startNum <= posNum && posNum <= endNum ){
                    posNum = endNum;
                }
            
            if(commands[i].equals("prev")){
                if(posNum -10 <= 0){
                    posNum = 0;
                }else{
                    posNum -=10;
                }
            }else{
                if(posNum + 10 >= videoNum){
                    posNum = videoNum;
                }else{
                    posNum +=10;
                }
            }
            if(startNum <= posNum && posNum <= endNum ){
                    posNum = endNum;
                }
        }
        
        answer = String.format("%02d"+":"+"%02d",posNum/60 , posNum%60);
        return answer;
    }
    
    
}