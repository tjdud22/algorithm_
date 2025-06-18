import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 중복 제거
        Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> reportMap = new HashMap<>();
        for(String rep : uniqueReports){
            String parts[] = rep.split(" ");
            String reportedUser = parts[1];
            reportMap.put(reportedUser, reportMap.getOrDefault(reportedUser,0)+1);
        }
            System.out.print(reportMap);
        
        List<String> reported = new ArrayList<>();
        for(String user : reportMap.keySet()){
            if(reportMap.get(user) >=k){
                reported.add(user);
            }
        }
        System.out.print(reported);
        
        int[] answer = new int[id_list.length];
        for(String rep : uniqueReports){
            String parts[] = rep.split(" ");
            String reportedUser = parts[0];
            String check = parts[1];
                for(int j=0; j<id_list.length; j++){
                    if(id_list[j].equals(reportedUser)){
                        for(int m=0; m<reported.size(); m++){
                            if(check!= null && reported.get(m).equals(check)){
                                answer[j]++;
                            }
                        }
                }
            }
        }
        
        return answer;
    }
}