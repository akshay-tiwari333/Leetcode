class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr=new int[nums.length];
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]==0){
               i++;
               
            }
            else{
                arr[j]=nums[i];
                j++;
                i++;
            }
        }
        for(int k=0;k<arr.length;k++){
            nums[k]=arr[k];
        }

        
    }
}