/* ------------- Question : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/ -----------------*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 2;
        int k=0;
        if(nums.length < 2)
            return nums.length;
        for(int i = 2 ; i < nums.length; i++) {
            if(nums[index-2] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

/*
Success
Details 
Runtime: 1 ms, faster than 65.03% of Java online submissions for Remove Duplicates from Sorted Array II.
Memory Usage: 45.1 MB, less than 6.26% of Java online submissions for Remove Duplicates from Sorted Array II.
Next challenges:
Search in Rotated Sorted Array
Count Negative Numbers in a Sorted Matrix
Final Value of Variable After Performing Operations(/
