/* ----------------------------------------- Question : https://leetcode.com/problems/binary-tree-inorder-traversal/ -------------------------------------------*/


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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp = root;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(!st.isEmpty() ||  temp != null) {
            if(temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                list.add(st.peek().val);
                temp = st.pop().right;
            }
        }
    
        return list;
    }
}

/*Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
Memory Usage: 40.5 MB, less than 5.15% of Java online submissions for Binary Tree Inorder Traversal.*/
