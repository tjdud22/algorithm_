import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        String[] todayArr = today.split("\\.");
        int today_total = Integer.parseInt(todayArr[0])*12*28 + Integer.parseInt(todayArr[1])*28 + Integer.parseInt(todayArr[2]);
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<terms.length; i++){
            String[] term = terms[i].split(" ");
            map.put(term[0],Integer.parseInt(term[1]));
            }
        System.out.print(map);
        
        for(int i=0; i<privacies.length; i++){
            String[] privacy = privacies[i].split(" ");
            String[] date = privacy[0].split("\\.");
            int date_total = Integer.parseInt(date[0])*12*28 + Integer.parseInt(date[1])*28 + Integer.parseInt(date[2]) + map.get(privacy[1])*28;
            
            if(today_total >= date_total){
                answer.add(i+1);
            }
        }
        int[] result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}