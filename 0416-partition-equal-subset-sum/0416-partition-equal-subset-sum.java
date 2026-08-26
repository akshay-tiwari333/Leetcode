class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
       
        int sum=0;
        for(int i: nums){
            sum=sum+i;
        }
        if(sum%2!=0) return false;
        int t=sum/2;
         dp=new Boolean[nums.length][t+1];
        return helper(nums,0,t);
      
        
    }
    public boolean helper(int[] nums,int i,int sum){
        if(i>=nums.length || sum<0) return false;
        if(dp[i][sum]!=null) return dp[i][sum];
        if(sum==0) return true;
       
       boolean t= helper(nums,i+1,sum-nums[i]);
        boolean  dt=helper(nums,i+1,sum);
        return dp[i][sum]= t || dt;
    


    }
}