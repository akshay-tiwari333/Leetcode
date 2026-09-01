class Solution {
    int[][] dp;
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums,0,-1);
        
    }
    public int helper(int[] nums,int i,int p){
        if(i>=nums.length) return 0;
        if(dp[i][p+1]!=-1) return dp[i][p+1];
        int take=0;
        if(p==-1 || nums[p]<nums[i]){
            take=1+helper(nums,i+1,i);
        }
        int not_take=helper(nums,i+1,p);
        return  dp[i][p+1]=Math.max(take,not_take);
    }
}