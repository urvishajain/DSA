/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null) return "";
        StringBuilder s= new StringBuilder();
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        { 
             TreeNode p = q.poll();
            if(p == null)
            {
                s.append("a ");
                continue;
            }
            q.add(p.left);
            q.add(p.right);
            s.append(p.val + " ");
                
             
         
            
        }
        return s.toString();
        
    }
    
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data=="") return null;
        Queue<TreeNode> q= new LinkedList<>();
        String[] val = data.split(" ");
    
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        q.add(root);
        int n = val.length;
        for(int i =1;i<n;i++)
        {
           
            TreeNode k = q.poll();
            if (val[i].equals("a"))
            {
                k.left=null;
              
            }
            else
            {
                k.left= new TreeNode(Integer.parseInt(val[i]));
                q.add(k.left);
                
            }
            if(!val[++i].equals("a"))
            {
                k.right = new TreeNode(Integer.parseInt(val[i]));
                q.add(k.right);
            }
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));