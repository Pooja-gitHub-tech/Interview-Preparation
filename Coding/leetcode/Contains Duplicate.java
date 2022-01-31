/* ------------------------ Question : https://leetcode.com/problems/contains-duplicate/ ------------------------------*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int x : nums) {
            if(!hset.add(x))
                return true;
        }
        return false;
        
/*Success
Details 
Runtime: 8 ms, faster than 65.05% of Java online submissions for Contains Duplicate.
Memory Usage: 71.1 MB, less than 32.85% of Java online submissions for Contains Duplicate.*/ 
        
        
        /*Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1; i++) {
            if((nums[i] ^ nums[i+1]) == 0)
                return true;
        }
        return false;*/
        
/*Success
Details 
Runtime: 31 ms, faster than 6.93% of Java online submissions for Contains Duplicate.
Memory Usage: 71.8 MB, less than 32.43% of Java online submissions for Contains Duplicate.*/
        
        /*HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            if(hmap.containsKey(nums[i]))
                return true;
            hmap.put(nums[i],1);
        }
        return false;*/

/*Success
Details 
Runtime: 9 ms, faster than 63.81% of Java online submissions for Contains Duplicate.
Memory Usage: 70.4 MB, less than 33.30% of Java online submissions for Contains Duplicate.*/
    }
}
