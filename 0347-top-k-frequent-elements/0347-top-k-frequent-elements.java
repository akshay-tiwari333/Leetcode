class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> hm = new HashMap<>();

        for(int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list,(a,b)-> b.getValue()-a.getValue());
        int[] res=new int[k];
        int i=0;
        for(int j=0;j<k;j++){
            res[i++]=list.get(j).getKey();
        }
        return res;

        
    }
}