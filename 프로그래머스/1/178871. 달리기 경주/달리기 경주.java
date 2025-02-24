import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> playerMap = new HashMap<>();
            for(int i=0; i<players.length; i++){
                playerMap.put(players[i],i);
            }
        
        for(String calling : callings){
            int currentIndex = playerMap.get(calling);
            if(currentIndex > 0){
                int prevIndex = currentIndex -1;
                
                String temp = players[prevIndex];
                players[prevIndex] = players[currentIndex];
                players[currentIndex] = temp;
                
                playerMap.put(calling,prevIndex);
                playerMap.put(temp,currentIndex);
            }
        }
        return players;
    }
}