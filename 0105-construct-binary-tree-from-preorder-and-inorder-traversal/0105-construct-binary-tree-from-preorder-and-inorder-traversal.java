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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int n = inorder.length;
        for(int i=0;i<n ;i++)
        {
            mp.put(inorder[i], i);
            
        }
        return helper(preorder, 0, n-1, inorder, 0, n-1, mp);
        
        
    }
    public TreeNode helper(int[] preorder,int sp, int ep,int[]  inorder, int si, int ei, Map<Integer, Integer> mp)
    {
        if (sp>ep || si>ei) return null;
        TreeNode root = new TreeNode(preorder[sp]);
        int i = mp.get(preorder[sp]);
        int k = (i-si);
        root.left = helper(preorder, sp+1, sp+k, inorder, si, i-1, mp);
        root.right = helper(preorder, sp+k+1, ep, inorder, i+1, ei, mp);
        return root;
        
        
    }
}
