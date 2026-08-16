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
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            List<Integer> ans=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
            TreeNode top=q.peek();
            if(top.left!=null)q.add(top.left);
            if(top.right!=null)q.add(top.right);
            ans.add(q.peek().val);
            q.remove();


            } 
            res.add(ans);

        }
        return res;

        
    }
}