class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int maxe=-1;
        for(int key : hm.keySet()){
            if(key%2==0){
                if(max<hm.get(key) ||
                (hm.get(key)==max && key<maxe)){
                    max=hm.get(key);
                    maxe=key;
                }
                
            }
        }
        return maxe;
        
    }
}