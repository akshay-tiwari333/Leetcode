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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=height(root.left)+height(root.right);
        if(root.left!=null) ans++;
        if(root.right!=null) ans++;
        int ans1=diameterOfBinaryTree(root.left);
        int ans2=diameterOfBinaryTree(root.right);
        return Math.max(ans,Math.max(ans1,ans2));
        
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));

    }
}