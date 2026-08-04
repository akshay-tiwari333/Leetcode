class Solution {
    int[] dp;
    public String stoneGameIII(int[] stoneValue) {
        dp=new int[stoneValue.length];
        Arrays.fill(dp,-99);
        int res=helper(stoneValue,0);
        if(res>0){
            return "Alice";
        }
        else if(res<0){
            return "Bob";
        }
        return "Tie";
        
    }
    public int helper(int[] nums,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-99) return dp[i];
        int firstWay=nums[i]-helper(nums,i+1);
        int secondWay=Integer.MIN_VALUE;
        if(i+1<nums.length){
            secondWay=nums[i]+nums[i+1]-helper(nums,i+2);
        }
        int thirdWay=Integer.MIN_VALUE;
        if(i+2<nums.length){
            thirdWay=nums[i]+nums[i+1]+nums[i+2]-helper(nums,i+3);
        }
        return dp[i]= Math.max(firstWay,Math.max(secondWay,thirdWay));
    }
}