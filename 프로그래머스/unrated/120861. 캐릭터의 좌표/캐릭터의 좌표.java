class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int x = 0;
        int y = 0;
        
        for(int i =0; i<keyinput.length; i++){
            
        if(keyinput[i].equals("left")){
            x--;
        }else if(keyinput[i].equals("right")){
            x++;
        }else if(keyinput[i].equals("up")){
            y++;
        }else{
            y--;
        }   
            
        x = Math.max(-board[0] / 2, Math.min(board[0] / 2, x));
        y = Math.max(-board[1] / 2, Math.min(board[1] / 2, y));
        }
        
        int[] answer = {x,y};
        return answer;
    }
}
