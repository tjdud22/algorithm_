class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String posPart [] = pos.split(":"); 
        String startPart [] = op_start.split(":");
        String endPart [] = op_end.split(":");
        String videoPart [] = video_len.split(":");
        
        int posNum = Integer.parseInt(posPart[0])*60 + Integer.parseInt(posPart[1]);
        int startNum = Integer.parseInt(startPart[0])*60 + Integer.parseInt(startPart[1]);
        int endNum = Integer.parseInt(endPart[0])*60 + Integer.parseInt(endPart[1]);
        int videoNum = Integer.parseInt(videoPart[0])*60 + Integer.parseInt(videoPart[1]);
        
        
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