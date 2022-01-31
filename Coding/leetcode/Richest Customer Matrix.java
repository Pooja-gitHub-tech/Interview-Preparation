/* ---------------------- Question: https://leetcode.com/problems/richest-customer-wealth/ --------------------*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < accounts.length; i++) {
            sum = 0 ;
            for(int j = 0 ; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}

/*Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
Memory Usage: 43 MB, less than 5.42% of Java online submissions for Richest Customer Wealth.
Next challenges:
Guess the Word
Check if There is a Valid Path in a Grid
Delivering Boxes from Storage to Ports*/
