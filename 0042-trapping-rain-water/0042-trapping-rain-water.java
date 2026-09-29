class Solution {
    public int trap(int[] nums) {
        int[] p=new int[nums.length];
        int[] s=new int[nums.length];
        p[0]=nums[0];
        s[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            p[i]=Math.max(p[i-1],nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--){
            s[i]=Math.max(s[i+1],nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans+Math.min(p[i],s[i])-nums[i];
        }
        return ans;
        
    }
}