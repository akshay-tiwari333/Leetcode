class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int t=sum-k;
            if(hm.containsKey(t)){
                c=c+hm.get(t);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        return c;
    }
}