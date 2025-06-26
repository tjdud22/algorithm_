class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] location = {0,0};
        
        String [][] parks = new String[park.length][park[0].length()];
        
        for(int i=0; i<park.length; i++){
            String[] temp = park[i].split("");
            parks[i] = temp;
        }
        
        for(int i=0; i<parks.length; i++){
            for(int j=0; j<parks[i].length; j++){
                if(parks[i][j].equals("S")){
                    //시작점
                    location[0] = i;
                    location[1] = j;
                }
                }
            }
        
        
        for(String route : routes){
            String[] parts = route.split(" ");
            
            String dir = parts[0];
            int distance = Integer.parseInt(parts[1]);
            
            if(dir.equals("S")){
                if( 0<=location[0]+distance
                   && location[0]+distance < parks.length){
                    int temp = location[0];
                    int end = location[0] + distance;
                    
                    while(location[0] < end){
                        if(parks[location[0]+1][location[1]].equals("X")){
                            location[0] = temp;
                            break;
                        }else{
                            location[0]++;
                        }
                    }
                }
            }
            
             if(dir.equals("N")){
                if( 0<=location[0]-distance 
                   && location[0]-distance < parks.length){
                    int temp = location[0];
                    int end = location[0] - distance;
                    
                    while(location[0] > end){
                        if(parks[location[0]-1][location[1]].equals("X")){
                            location[0] = temp;
                            break;
                        }else{
                            location[0]--;
                        }
                    }
                }
            }
            
            
            if(dir.equals("W")){
                if( 0<=location[1]-distance 
                   && location[1]-distance < parks[0].length){
                    int temp = location[1];
                    int end = location[1] - distance;
                    
                    while(location[1] > end){
                        if(parks[location[0]][location[1]-1].equals("X")){
                            location[1] = temp;
                            break;
                        }else{
                            location[1]--;
                        }
                    }
                }
            }
            
            if(dir.equals("E")){
                if( 0<=location[1]+distance 
                   && location[1]+distance < parks[0].length){
                    int temp = location[1];
                    int end = location[1] + distance;
                    
                    while(location[1] < end){
                        if(parks[location[0]][location[1]+1].equals("X")){
                            location[1] = temp;
                            break;
                        }else{
                            location[1]++;
                           
                        }
                    }
                }
            }
        }
        return location;
    }
}