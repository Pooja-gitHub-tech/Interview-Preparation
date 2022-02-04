/* ------------------------------- Question : https://leetcode.com/problems/4sum-ii/  -------------------------------*/

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer > hmap = new HashMap<>();
        int count = 0 ;
        
        for(int k: nums3) {
            for(int l : nums4) {
                hmap.put(k+l,hmap.getOrDefault(k+l,0)+1);
            }
        }
        
        for(int i : nums1)  {
            for(int j : nums2) {
                count+= hmap.getOrDefault(-(i+j),0);
            }
        }
        return count;
        
        
        
        
        
        
        /*int count = 0 ;
        Map<Integer,Integer> hmap = new HashMap<>();
        
        for(int l : nums4) {
            hmap.put(l,hmap.getOrDefault(l,0)+1); // here we are saving frequency.
        }
        
        for(int i : nums1) {
            for(int j : nums2) {
                for(int k : nums3) {
                    count = count + hmap.getOrDefault(-(i+j+k),0);
                }
            }
        }
       return count;
        
        //O(n^4)
        int count=0;
        for(int i : nums1) {
            for(int j : nums2) {
                for(int k : nums3) {
                    for(int l : nums4) {
                        if(i+j+k+l == 0) ++count;
                    }
                }
            }
        }
       return count;*/
    }
}

/*Success
Details 
Runtime: 215 ms, faster than 33.82% of Java online submissions for 4Sum II.
Memory Usage: 57.1 MB, less than 27.65% of Java online submissions for 4Sum II.
Next challenges:
4Sum
*/
