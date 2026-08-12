class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        int j=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(hm.get(nums[i])>k){
                hm.put(nums[j],hm.get(nums[j])-1);
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
        
    }
}