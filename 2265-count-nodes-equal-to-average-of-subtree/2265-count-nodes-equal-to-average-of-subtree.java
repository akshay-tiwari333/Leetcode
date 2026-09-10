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
    public int averageOfSubtree(TreeNode root) {
        int ans=0;
        if(root==null) return 0;
        int sum=helper(root);
        int c=helper1(root);
        int a=sum/c;
        if(root.val==a)ans++;
       ans=ans+ averageOfSubtree(root.left);
       ans=ans+ averageOfSubtree(root.right);
        return ans;


    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        
        return root.val+helper(root.left)+helper(root.right);  
        
    }
    public int helper1(TreeNode root){
        if(root==null) return 0;
        return 1+helper1(root.left)+helper1(root.right);
    }
}