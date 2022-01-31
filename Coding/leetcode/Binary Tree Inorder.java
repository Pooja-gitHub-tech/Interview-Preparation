/* ------------------------ Question: https://leetcode.com/problems/binary-tree-inorder-traversal/    --------------------*/
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
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    
    public void inorder(TreeNode node, List<Integer> list) {
        if(node == null) 
            return;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
        
    }
}


/*TreeNode temp = root;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(temp == null)
            return list;
        while(temp.left!=null) {
            st.push(temp.left);
            temp = temp.left;
        }
        while(!st.isEmpty()) {
            temp = st.pop();
            list.add(temp.val);
            if(temp.right != null) list.add(temp.right.val);
        }
        temp = root;
        if(temp!=null)
            list.add(temp.val);
        else
            return list;
        while(temp.right!=null) {
            st.push(temp.right);
            temp = temp.right;
        }
        while(!st.isEmpty()) {
            temp = st.pop();
            if(temp.left != null) list.add(temp.left.val);
            list.add(temp.val);
        }
        return list;*/

/*Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
Memory Usage: 42.2 MB, less than 5.15% of Java online submissions for Binary Tree Inorder Traversal.
Next challenges:
Validate Binary Search Tree
Binary Tree Preorder Traversal
Binary Tree Postorder Traversal
Binary Search Tree Iterator
Kth Smallest Element in a BST
Closest Binary Search Tree Value II
Inorder Successor in BST
Convert Binary Search Tree to Sorted Doubly Linked List
Minimum Distance Between BST Nodes*/

