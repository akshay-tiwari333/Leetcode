class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<nums.length;i++){
            high=high+nums[i];
            low=Math.max(low,nums[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=helper(nums,mid);
            if(ans<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
      
        
    }
    public int helper(int[] nums,int max){
        int s=1;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(p+nums[i]<=max){
                p=p+nums[i];
            }
            else{
                s++;
                p=nums[i];
            }
        }
        return s;
    }
}