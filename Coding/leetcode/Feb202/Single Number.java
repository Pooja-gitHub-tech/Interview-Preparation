/*============================== Question : https://leetcode.com/problems/single-number/ ==========================*/
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0 ; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}

/*Success
Details 
Runtime: 1 ms, faster than 95.92% of Java online submissions for Single Number.
Memory Usage: 51.2 MB, less than 22.10% of Java online submissions for Single Number.
Next challenges:
Single Number II
Single Number III
Missing Number
Find the Duplicate Number*/
