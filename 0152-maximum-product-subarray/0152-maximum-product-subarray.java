class Solution {
    public int maxProduct(int[] nums) {
        int suf=1;
        int pre=1;
       
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(suf==0) suf=1;
            if(pre==0) pre=1;
            suf=suf*nums[i];
            pre=pre*nums[nums.length-1-i];
            max=Math.max(max,Math.max(suf,pre));
        }
        return max;
        
    }
}