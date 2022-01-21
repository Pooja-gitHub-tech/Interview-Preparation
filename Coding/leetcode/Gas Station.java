/* ------------------- Question: https://leetcode.com/problems/gas-station/ ------------------------------------*/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remainingGas = 0 ;
        int potentialStation = 0;
        int total = 0 ;
        
        for(int i = 0 ; i < gas.length ; i++) {
            total+= gas[i] - cost[i];
            remainingGas += gas[i] - cost[i];
            if(remainingGas < 0 ) {
                remainingGas = 0;
                potentialStation = i + 1;
            }
        }
        
        return total < 0 ? -1 : potentialStation;
    }
}





/*Success
Details 
Runtime: 3 ms, faster than 46.62% of Java online submissions for Gas Station.
Memory Usage: 64.3 MB, less than 14.00% of Java online submissions for Gas Station.
Next challenges:
Sort Colors
Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
Jump Game VI */
