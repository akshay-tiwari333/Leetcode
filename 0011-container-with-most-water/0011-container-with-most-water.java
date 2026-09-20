class Solution {
    public int maxArea(int[] nums) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int ans=Math.min(nums[i],nums[j]);
            int res=ans*(j-i);
            max=Math.max(res,max);

            if(nums[i]<nums[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
        
        
    }
}