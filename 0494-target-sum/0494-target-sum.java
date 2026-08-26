class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0);
    }

    public int helper(int[] nums, int t, int i) {

        if(i >= nums.length) {
            if(t == 0) return 1;
            return 0;
        }

        int ta = 0;

        ta = helper(nums, t - nums[i], i + 1)
           + helper(nums, t + nums[i], i + 1);

        return ta;
    }
}