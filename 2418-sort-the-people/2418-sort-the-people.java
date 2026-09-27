class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> hm=new HashMap<>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
        List<Map.Entry <Integer,String>> list=new ArrayList<>(hm.entrySet());
        Collections.sort(list,(a,b)-> b.getKey()-a.getKey());
        String[] ans=new String[names.length];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i).getValue();
        }
        return ans;
    }
}