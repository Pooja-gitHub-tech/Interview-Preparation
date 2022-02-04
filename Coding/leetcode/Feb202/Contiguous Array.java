/* -------------------------- Question: https://leetcode.com/problems/contiguous-array/  ------------------------*/

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>  hmap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : nums[i]);
            if(sum == 0)
                maxLength = i+1;
            else if(hmap.containsKey(sum)) {
                maxLength = Math.max(maxLength,i - hmap.get(sum));
            }
            else 
                hmap.put(sum,i);
        }
        return maxLength;
    }
}


/*

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 
Input [1,0,1,0,1,0,1,1,0,0] // only contains one's and zero's
Output 10 // maximum length

Success
Details 
Runtime: 40 ms, faster than 42.94% of Java online submissions for Contiguous Array.
Memory Usage: 85.1 MB, less than 51.71% of Java online submissions for Contiguous Array.
Next challenges:
Maximum Size Subarray Sum Equals k*/
