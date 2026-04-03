import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map.put(want[i],number[i]);
        }
        for(int i=0; i<=discount.length-10; i++){
            HashMap<String,Integer> copy = new HashMap<>(map);
            String [] sliced = Arrays.copyOfRange(discount,i,i+10);
            for(int j=0; j<sliced.length; j++){
                if(copy.containsKey(sliced[j])){
                    copy.put(sliced[j],copy.get(sliced[j])-1);
                }else{
                    break;
                }
                if(copy.get(sliced[j])==0){
                    copy.remove(sliced[j]);
                }
            }
             if(copy.size() ==0){
                    answer+=1;
                }
        }
        System.out.println(map);
        return answer;
    }
}