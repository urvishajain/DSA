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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        helper(root);
        return ans;
        
    }
    int helper(TreeNode root)
    {
           if (root==null)
         {
             return 0;
         }
        int a = helper(root.left);
        int b = helper(root.right);
        int c =  a + b;
        
        int key = Math.max(0, Math.max(c,Math.max(a,b))) + root.val;
        ans = Math.max(ans, key);
        return Math.max(root.val, Math.max(a,b)+root.val);
            
        
    }
}