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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<TreeNode>();
        List<List<Integer>> ans= new LinkedList<List<Integer>>();
        if (root == null) return ans;
        q.offer(root);
        while(q.size()>0)
        {
            int n = q.size();
            List<Integer> ans1= new LinkedList<Integer>();
            for(int i =0;i<n;i++)
            {
                TreeNode p = q.poll();
                if(p.left!=null)
                {
                   q.offer(p.left);
                }
                if(p.right!=null)
                {
                    q.offer(p.right);
                }
                ans1.add(p.val);
                
                
             
            }
            ans.add(ans1);
            
        }
        return ans;
        
        
    }
}