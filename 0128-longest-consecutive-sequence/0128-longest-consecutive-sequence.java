class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int max=0;
        for(int i : hs){
            int ans=i;
            
            int c=1;
            if(!hs.contains(ans-1)){
            while(hs.contains(ans+1)){
                    c++;
                    ans++;
            }
            max=Math.max(max,c);
            }
        }
        return max;
        
    }
}