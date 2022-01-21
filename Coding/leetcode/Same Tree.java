/** ------------------ Question: https://leetcode.com/problems/same-tree/ ----------------------
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if((p == null && q != null) || (p != null && q == null)) return false;
        
        if(p == null && q == null) return true;
        
        if((p != null && q != null) && (p.val != q.val)) return false;
        
        return (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right)); 
    }
}

/*Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
Memory Usage: 38.6 MB, less than 8.16% of Java online submissions for Same Tree.
Next challenges:
Smallest String Starting From Leaf
Smallest Common Region
Second Minimum Time to Reach Destination*/
