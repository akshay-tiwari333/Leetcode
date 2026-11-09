class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                c=c+(nums[i+1]-nums[i]);
                nums[i]=nums[i+1];
            }
        }
        return c;
        
    }
}