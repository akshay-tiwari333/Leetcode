class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         List<Integer>  ans=new ArrayList<>();
         Map<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
         }
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
         }
         for(int i=min;i<=max;i++){
            if(!hm.containsKey(i)){
                ans.add(i);
            }
            else{
                continue;
            }
         }
         return ans;
        
    }
}