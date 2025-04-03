import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        List<Integer> answer = new ArrayList<>();

        Map<Integer,Float> map = new HashMap<>();
        int denominator = stages.length;
        
            for(int j=1; j<=N; j++){
                int temp =0;
                for(int i=0; i<stages.length; i++){
                    if(j == stages[i]){
                        temp++;
                    }
                }
            // 0으로 나누는 경우 방지
            if (denominator > 0) {
                map.put(j, (float) temp / denominator);
            } else {
                map.put(j, 0.0f); 
            }
                denominator -= temp;
        }
            
        List<Map.Entry<Integer,Float>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        
        for(int i=0; i<list.size(); i++){
            answer.add(list.get(i).getKey());
        }
        
        // List<Integer>를 int[] 배열로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}