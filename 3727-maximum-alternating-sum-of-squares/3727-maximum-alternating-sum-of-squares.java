class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        for(int p=0;p<nums.length;p++){
            nums[p]=nums[p]*nums[p];

        }
        if(nums.length==1) return nums[0];
        int n=nums.length;
        if(nums.length%2!=0){
            int i=0;
            int j=nums.length-1;
            Arrays.sort(nums);
            long ans=0;
            while(i<j){
                ans+=nums[j]-nums[i];
                i++;
                j--;
                if(i==j){
                    ans=ans+nums[i];
                }
            }
            return ans;
        }
        else{
            Arrays.sort(nums);
            int k=0;
            int l=nums.length-1;
            long res=0;
            while(k<l){
                  res+=nums[l]-nums[k];
                k++;
                l--;

            }
            return res;


        }

        
    }
}