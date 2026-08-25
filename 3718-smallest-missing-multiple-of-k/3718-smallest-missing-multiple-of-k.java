class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hs=new HashSet<>();
        for(int i: nums){
            hs.add(i);
        }
        int j=1;
        while(true){
            int ans=k*j;
            if(!hs.contains(ans)){
                return ans;
                
            }
            j++;
        }
       
        
    }
}