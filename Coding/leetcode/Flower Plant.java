/* ----------------------------- Question: https://leetcode.com/problems/can-place-flowers/ ------------------------*/
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int i = 0 ;
        while(i < flowerbed.length) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) &&
              (i == flowerbed.length -1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                ++count;
            }
            ++i;
        }
        return count >=n ;
    }
}

/*Success
Details 
Runtime: 1 ms, faster than 92.38% of Java online submissions for Can Place Flowers.
Memory Usage: 49.1 MB, less than 37.97% of Java online submissions for Can Place Flowers.

*/
