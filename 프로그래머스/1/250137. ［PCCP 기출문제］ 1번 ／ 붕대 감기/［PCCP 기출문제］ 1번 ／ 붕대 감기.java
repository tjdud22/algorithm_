class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int maxHealth = health;

        int attacksIdx = 0;
        int cnt = 0;

        for (int time = 1; time <= attacks[attacks.length - 1][0]; time++) {
            if (attacksIdx < attacks.length && time == attacks[attacksIdx][0]) {
                health -= attacks[attacksIdx++][1];
                cnt = 0;             } else {
                cnt++;
                health += x;
                if (cnt == t) {
                    health += y;
                    cnt = 0;                 }
                if (health > maxHealth) {
                    health = maxHealth;                 
		}
            }

            if (health <= 0) {
                return -1;
            }
        }

        return health;
    }
}
