/* -------------------- Question : https://leetcode.com/problems/longest-increasing-subsequence/ ---------------------------*/

class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i = 0 ; i < nums.length; i++) {
            hmap.put(nums[i],1);
            for(Map.Entry<Integer,Integer> entry : hmap.entrySet()) {
                if(entry.getKey() < nums[i] && hmap.get(nums[i]) < entry.getValue() + 1) {
                    hmap.put(nums[i],hmap.get(entry.getKey())+1);
                }
                len = Math.max(len,hmap.get(nums[i]));
            }
        }
        return len;
    }
}



/*Success
Details 
Runtime: 1288 ms, faster than 5.00% of Java online submissions for Longest Increasing Subsequence.
Memory Usage: 118.5 MB, less than 5.01% of Java online submissions for Longest Increasing Subsequence.
Next challenges:
Increasing Triplet Subsequence
Russian Doll Envelopes
Maximum Length of Pair Chain
Number of Longest Increasing Subsequence
Minimum ASCII Delete Sum for Two Strings
Minimum Number of Removals to Make Mountain Array
Find the Longest Valid Obstacle Course at Each Position
Minimum Operations to Make the Array K-Increasing

*/
