class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >=100000 && price<300000){
           answer = (int)(price*(1-0.05));
        }else if(price>=300000 && price<500000 ){
             answer = (int)(price*(1-0.1));
        }else if(price>=500000 ){
             answer = (int)(price*(1-0.2));
        }else
        { answer = price;}
        return answer;
    }
}