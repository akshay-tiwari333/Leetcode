class Solution {
    public int trap(int[] height) {
        int[] ls=new int[height.length];
        int[] rs=new int[height.length];
        ls[0]=height[0];
        rs[rs.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            ls[i]=Math.max(ls[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            rs[i]=Math.max(rs[i+1],height[i]);
        }
        int ans=0;
        for(int i=1;i<height.length-1;i++){
            ans=ans+(Math.min(ls[i],rs[i])-height[i]);
        }
        return ans;
        
    }
}