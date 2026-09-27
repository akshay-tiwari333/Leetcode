class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hm.entrySet());
        Collections.sort(list,(a,b)-> {
            if(a.getValue()!=b.getValue()){
                return a.getValue()-b.getValue();
            }
            else{
                return b.getKey()-a.getKey();
            }
        });
        int[] res=new int[nums.length];
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int ans=list.get(i).getValue();
            while(ans>0){
                ls.add(list.get(i).getKey());
                ans--;

            }
        }
        int z=0;
        for(int u: ls){
            res[z++]=u;
        }
        return res;
        
    }
}