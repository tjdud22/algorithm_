class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int dx[] = {0,1,1,1,0,-1,-1,-1};
        int dy[] = {1,1,0,-1,-1,-1,0,1};
        
        int len = board.length;
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(board[i][j] == 1){
                    for(int k=0; k<dx.length; k++){
                        if(i+dx[k] >= 0 && i+dx[k] < len && j+dy[k] >=0 && j+dy[k] < len) 
                            if(board[i+dx[k]][j+dy[k]] !=1 )board[i+dx[k]][j+dy[k]] =2;
                    }
                }
            }
        }
        
        for(int i =0; i<len; i++){
            for(int j=0; j<len; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}