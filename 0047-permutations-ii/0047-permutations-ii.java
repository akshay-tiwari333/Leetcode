class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        helper(nums,ans,res,hm);
        return res;


        
    }
    public void helper(int[] nums,List<Integer> ans,List<List<Integer>> res,Map<Integer,Integer> hm){
        if(ans.size()==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int key:hm.keySet()){
            if(hm.get(key)==0) continue;
            if(hm.get(key)>0){
                ans.add(key);
                hm.put(key,hm.get(key)-1);
                helper(nums,ans,res,hm);
                hm.put(key, hm.get(key) + 1);
                ans.remove(ans.size()-1);
            }
        }
    }
}