class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int ans=target-nums[i];
            if(hm.containsKey(ans) && hm.get(ans)!=i){
                return new int[]{i,hm.get(ans)};
            }
        }
        return new int[]{-1,-1};
        
    }
}