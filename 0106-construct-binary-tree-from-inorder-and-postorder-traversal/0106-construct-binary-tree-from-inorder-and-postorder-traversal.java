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
    public TreeNode buildTree(int[] i, int[] p) {
        int n=i.length;
        return helper(i,0,n-1,p,0,n-1);
        
    }
    public TreeNode helper(int[] i,int is,int ie,int[] p,int ps,int pe){
        if(is>ie || ps>pe) return null;
        TreeNode root=new TreeNode(p[pe]);
        int j=is;
        while(i[j]!=p[pe])j++;
        int k=j-is;
        root.left=helper(i,is,j-1,p,ps,ps+k-1);
        root.right=helper(i,j+1,ie,p,ps+k,pe-1);
        return root;
    }
}