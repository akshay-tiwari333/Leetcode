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
    public TreeNode buildTree(int[] p, int[] i) {
        int n=p.length;
        return helper(p,0,n-1,i,0,n-1);  
    }
    public TreeNode helper(int[] p,int s,int e,int[] i,int ss,int ee){
        if(s>e || ss>ee) return null;
        TreeNode root=new TreeNode(p[s]);
         int j=ss;
         while(i[j]!=p[s]) j++;
         int k=j-ss;
         root.left=helper(p,s+1,s+k,i,ss,j-1);
         root.right=helper(p,s+k+1,e,i,j+1,ee);
         return root;


    }
    
}