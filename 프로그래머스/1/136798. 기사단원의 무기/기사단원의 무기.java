import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=number; i++){
            int cnt = 0;
            for(int j=1; j*j<=i; j++){
                if(i % j == 0){ 
                    cnt++; // 작은 약수 j
                    if(j != i / j){
                        cnt++; // 짝이 되는 큰 약수
                    }
                }
            }
            list.add(cnt);
        }
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>limit){
                answer += power;
            }else{
                answer += list.get(i);
            }
                
        }
        
        
        return answer;
    }
}