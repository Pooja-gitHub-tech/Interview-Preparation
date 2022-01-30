/* ------------------------------------------- Question: https://leetcode.com/problems/rotate-array/ ----------------------------------*/
class Solution {
  
  public void rotate(int[] nums,int k) {
    k = k % nums.length;
    if(k < nums.length) {
      k+ = nums.length;
    }
    
    reverse(nums,0,nums.length-k-1);
    reverse(nums,nums.length-k,nums.length-1);
    reverse(nums,0,nums.length-1);
    
  }
  
  public void reverse (int nums[], int li, int ri) {
    int temp;
    while(li<ri) {
      temp = nums[li];
      nums[li] = nums[ri];
      temp = nums[li];
    }
  }
  
}

/*Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
Memory Usage: 63.9 MB, less than 37.18% of Java online submissions for Rotate Array.
Next challenges:
Rotate List
Reverse Words in a String II*/
