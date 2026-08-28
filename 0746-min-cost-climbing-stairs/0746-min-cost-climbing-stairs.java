class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int ans=helper(cost,0);
        int res=helper(cost,1);
        return Math.min(ans,res);
        
    }
    public int helper(int[] nums,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+helper(nums,i+1);
        int notTake=nums[i]+helper(nums,i+2);
        return dp[i]= Math.min(take,notTake);
    }
}