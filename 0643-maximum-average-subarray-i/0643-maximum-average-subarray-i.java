class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j=0;
        double max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while((i-j+1)==k){
                max=Math.max(max,sum);
                sum=sum-nums[j];
                j++;
            }

        }
        return max/k;
        
    }
}