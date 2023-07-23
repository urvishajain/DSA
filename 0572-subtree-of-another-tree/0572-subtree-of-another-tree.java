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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null || subRoot == null) return root==subRoot;
       
        boolean p = isSubtree(root.left, subRoot);
        boolean q= isSubtree(root.right, subRoot);
        boolean c = false;
        if (root.val==subRoot.val)
        {
             c = helper(root, subRoot);
        }
        return p || q || c;
        
    }
    private boolean helper(TreeNode root,TreeNode subR)
    {
        if (root==null || subR==null)
        {
            return root==subR;
        }
        return root.val==subR.val && helper(root.left,subR.left) && helper(root.right, subR.right);
    }
}