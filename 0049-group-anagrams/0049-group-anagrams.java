class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String ans=strs[i];
            char[] a=ans.toCharArray();
            Arrays.sort(a);
            String res=new String(a);
            if(!hm.containsKey(res)){
                hm.put(res,new ArrayList<>());
            }
            hm.get(res).add(ans);
        }
        return new ArrayList<>(hm.values());
        
    }
}