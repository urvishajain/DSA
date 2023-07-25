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
    public int cnt =0;
    public int ans =-1;
    public int kthSmallest(TreeNode root, int k) {
        
        if (root==null) return 0;
        kthSmallest(root.left, k);
        cnt++;
        if (cnt==k)
        {
            ans = root.val;
            return ans;
        }
        kthSmallest(root.right, k);
        return ans;
    }
}