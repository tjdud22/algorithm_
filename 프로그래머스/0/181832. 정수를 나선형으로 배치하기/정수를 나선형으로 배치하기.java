class Solution {
    public int[][] solution(int n) {
        int answer [][] = new int[n][n];
        
        int x =0;
        int y =0;
        int num = 1;
        
        int dir =0; 
        
        while(num <=n*n){
            answer[x][y] = num++;
            
            if(dir == 0){
                if(y<n-1 && answer[x][y+1] == 0){
                    y++;
                }else{
                    dir = 1;
                    x++;
                }
            }else if(dir == 1){
                if(x<n-1 && answer[x+1][y] == 0){
                    x++;
                }else{
                    dir = 2;
                    y--;
                }
            }else if(dir == 2){
                if(y>=1 && answer[x][y-1] == 0){
                    y--;
                }else{
                    dir = 3;
                    x--;
                }
            }else if(dir == 3){
                if(x>=1 && answer[x-1][y] == 0){
                    x--;
                }else{
                    dir = 0;
                    y++;
                }
            }
        }
        return answer;
    }
}