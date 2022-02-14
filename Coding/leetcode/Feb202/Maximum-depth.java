/* ------------------ Question : https://leetcode.com/problems/maximum-depth-of-binary-tree/ -------------------------------------*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}

/*
Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 43.4 MB, less than 7.99% of Java online submissions for Maximum Depth of Binary Tree.
Next challenges:
Balanced Binary Tree
Minimum Depth of Binary Tree
Maximum Depth of N-ary Tree
Time Needed to Inform All Employees
*/
