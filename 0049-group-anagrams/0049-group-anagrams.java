class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String ans=strs[i];
            char[] arr=ans.toCharArray();
            Arrays.sort(arr);
            String res=new String(arr);
            if(!hm.containsKey(res)){
                hm.put(res,new ArrayList<>());
            }
            hm.get(res).add(ans);
        }
        return new ArrayList<>(hm.values());
        
    }
}