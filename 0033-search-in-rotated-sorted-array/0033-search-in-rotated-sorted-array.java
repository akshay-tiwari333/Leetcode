class Solution {
    public int search(int[] nums, int target) {
        int p=pivot(nums);
        if(p==-1) return bs(nums,0,nums.length-1,target);
        if(nums[p]==target) return p;
        if(nums[0]>target) return bs(nums,p+1,nums.length-1,target);
        return bs(nums,0,p,target);   
    }
    public int bs(int[] nums,int i, int j,int t){
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==t)  return mid;
            else if(nums[mid]>t) j=mid-1;  
            else i=mid+1; 
        }
        return -1;
    }
    public int pivot(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[mid+1])return mid;
            if( mid>0 && nums[mid-1]>nums[mid]) return mid-1;
            if(nums[i]<nums[mid]) i=mid+1;
            else j=mid-1; 
        }
         return -1;
    }
}