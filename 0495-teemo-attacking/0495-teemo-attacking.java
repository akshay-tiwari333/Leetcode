class Solution {
    public int findPoisonedDuration(int[] nums, int duration) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            int gap=nums[i+1]-nums[i];
            if(gap>=duration) ans=ans+duration;
            else ans=ans+gap;
        }
        ans=ans+duration;
        return ans;

        
    }
}