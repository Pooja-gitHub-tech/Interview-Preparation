/*-------------------- Question : https://leetcode.com/problems/stone-game-iv/ --------------------------*/

class Solution {
    Boolean[] dp = new Boolean[100001];

        public boolean winnerSquareGame(int n) {
            if (n == 0) return false;
            if (dp[n] != null) return dp[n];
            boolean winner = false;
            for (int i = 1; i * i <= n; i++) {
                if (!winnerSquareGame(n - i * i)) {
                    winner = true;
                    break;

                }
            }
            return dp[n] = winner;
        }
}
/*Success
Details 
Runtime: 79 ms, faster than 38.15% of Java online submissions for Stone Game IV.
Memory Usage: 65.6 MB, less than 19.08% of Java online submissions for Stone Game IV.
Next challenges:
Stone Game V
Stone Game VI
Stone Game VII
Stone Game VIII
Stone Game IX*/
