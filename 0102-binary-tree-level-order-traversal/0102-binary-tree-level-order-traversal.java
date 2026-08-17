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
        List<List<Integer>> res=new ArrayList<>();
        int level=height(root)+1;
        if(root==null) return res;
        for(int i=1;i<=level;i++){
            List<Integer> ans=new ArrayList<>();
            nth(root,i,ans);
            res.add(ans);
        }
        return res;
        
    }
    public void nth(TreeNode root,int n,List<Integer> ans){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        nth(root.left,n-1,ans);
        nth(root.right,n-1,ans);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));

    }
}