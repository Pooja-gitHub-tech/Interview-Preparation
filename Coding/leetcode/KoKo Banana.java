/*------------------------- Question:  https://leetcode.com/problems/koko-eating-bananas/. ------------- */
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0 ;
        int high = 0 ;
        int speed = Integer.MAX_VALUE ;
        int max=Integer.MIN_VALUE;
        for(int x : piles) {
            max = Math.max(x,max);
        }
        high = max;
        
        while(low <= high) {
            int sp = low + (high - low)/2;
            if(isPossible(sp,piles,h)==true) {
                speed = sp;
                high = sp-1 ;
            }
            else {
                low = sp + 1;
            }
        }
        return speed;
    }
    
    public boolean isPossible(int sp , int[] piles, int h) {
        double sum = 0 ;
        for(int i = 0 ; i < piles.length ; i++) {
            sum = sum + Math.ceil(piles[i]*1.0/sp);
        }
        if(sum <= h)
            return true;
        return false;
    }
}



/*Success
Details 
Runtime: 52 ms, faster than 8.14% of Java online submissions for Koko Eating Bananas.
Memory Usage: 52.2 MB, less than 17.05% of Java online submissions for Koko Eating Bananas.
*/
