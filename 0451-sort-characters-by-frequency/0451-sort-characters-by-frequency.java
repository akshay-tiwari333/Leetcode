class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(hm.entrySet());
        Collections.sort(list,(a,b)-> b.getValue()-a.getValue());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            int ans=list.get(i).getValue();
            while(ans>0){
                sb.append(list.get(i).getKey());
                ans--;
            }
            
        }
        return sb.toString();
        
    }
}