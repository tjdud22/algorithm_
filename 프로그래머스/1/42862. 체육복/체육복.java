import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Set<Integer> lostSet= new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int l : lost){
            lostSet.add(l);
        }
        
        for(int r : reserve){
            //여벌 체육복을 가져온 학생이 체육복을 도난
            if(lostSet.contains(r)){
                lostSet.remove(r);
            }else{
            reserveSet.add(r);
            }
        }
        
        List<Integer> sortedLost = new ArrayList<>(lostSet);
        Collections.sort(sortedLost);
        
        for(int s : sortedLost){
            if(reserveSet.contains(s-1)){
                reserveSet.remove(s-1);
            }else if(reserveSet.contains(s+1)){
                reserveSet.remove(s+1);
            }else{
                n--;
            }
        }
        
        return n;
    }
}