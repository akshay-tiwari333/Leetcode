class Solution {
    int[][] dp;
    int total;
    public int findTargetSumWays(int[] nums, int target) {
       
        total = 0;

        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        dp = new  int[nums.length][2 * total + 1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums,target,0);
        
    }
    public int helper(int[] nums,int t,int i){
        if(Math.abs(t) > total) return 0;
        
        if(i==nums.length){
            if(t==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[i][t+total]!=-1) return dp[i][t+total];
        int p=helper(nums,t+nums[i],i+1);
        int n=helper(nums,t-nums[i],i+1);
        return dp[i][t+total]=p+n;
    }
}