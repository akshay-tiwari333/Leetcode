class Solution {
    public int shipWithinDays(int[] nums, int k) {
         int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            sum=sum+nums[i];
        }
        int s=max;
        int e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            int c=helper(nums,mid);
            if(c>k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
        
    }
    public int helper(int[] nums,int maxPages){
        int s=1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(ans+nums[i]<=maxPages){
                ans=ans+nums[i];
            }
            else{
                s++;
                ans=nums[i];
            }
        }
        return s;
        
    }
}