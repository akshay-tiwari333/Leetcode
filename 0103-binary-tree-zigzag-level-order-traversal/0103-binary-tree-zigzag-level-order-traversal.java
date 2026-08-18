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
    public int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nth1(TreeNode root,int n,List<Integer> ans){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        nth1(root.left,n-1,ans);
        nth1(root.right,n-1,ans);

    }
    public void nth2(TreeNode root,int n,List<Integer> ans){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        nth2(root.right,n-1,ans);
        nth2(root.left,n-1,ans);
        

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        int l=height(root)+1;
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        for(int i=1;i<=l;i++){
            List<Integer> ans=new ArrayList<>();
            if(i%2==0){
                nth2(root,i,ans);
            }
            else{
                nth1(root,i,ans);
            }
            res.add(ans);
        }
        return res;

        
        
    }
}