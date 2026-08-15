class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        if(n == 0) return true;
        int i=0;
        while(i<nums.length){
            if(nums[i]==1) i++;
            else{
               if((i == 0 || nums[i-1] != 1) &&
   (i == nums.length-1 || nums[i+1] != 1)){
                    nums[i]=1;
                    n--;
                    i++;
                    if(n==0) return true;
                }
                else{
                    i++;
                }
            }


        }
        return false;
        
    }
}