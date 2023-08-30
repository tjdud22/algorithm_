class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int servings = n / 10; 
        
        int yakitoriCost = n * 12000;
        int drinkCost = k * 2000;
        
        if (servings > 0) {
            drinkCost -= servings * 2000; 
        }

        answer = yakitoriCost + drinkCost;
        
        return answer;
    }
}