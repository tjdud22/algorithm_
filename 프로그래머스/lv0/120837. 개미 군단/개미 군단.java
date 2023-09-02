class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int generals = hp / 5; 
        hp %= 5; 
        
        int soldiers = hp / 3; 
        hp %= 3;
      
     answer = generals + soldiers + hp;
        
        return answer;
    
    }
}