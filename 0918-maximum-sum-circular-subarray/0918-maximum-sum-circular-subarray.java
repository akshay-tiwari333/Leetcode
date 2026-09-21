class Solution {
    public int maxKadene(int[] nums){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
       public int minKadene(int[] nums){
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            min=Math.min(sum,min);
            if(sum>0){
                sum=0;
            }
        }
        return min;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int maxkadene=maxKadene(nums);
        int minkadene=minKadene(nums);
        int minKadeneResult=sum-minkadene;
        if(maxkadene<0) return maxkadene;
        return Math.max(maxkadene,minKadeneResult);
    }
}