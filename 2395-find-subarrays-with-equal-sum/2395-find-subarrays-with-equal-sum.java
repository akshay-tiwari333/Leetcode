class Solution {
    public boolean findSubarrays(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        int j=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if((i-j+1)==2){
                ls.add(sum);
                sum=sum-nums[j];
                j++;
            }
        }
        Set<Integer> hs=new HashSet<>();
        for(int k: ls){
            if(hs.contains(k)) return true;
            hs.add(k);
        }
        return false;
       

        
    }
}