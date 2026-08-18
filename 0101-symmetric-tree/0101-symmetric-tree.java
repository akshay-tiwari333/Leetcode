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
    public TreeNode helper1(TreeNode root){
        if(root==null) return null;
        TreeNode l=root.left;
        root.left=helper1(root.right);
        root.right=helper1(l);
        return root;
    }
    public boolean helper2(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return helper2(p.left,q.left) && helper2(p.right,q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        root.left=helper1(root.left);
        return helper2(root.left,root.right);
        
    }
}