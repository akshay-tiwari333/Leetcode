class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }
        int si=-1;
        int c=hm.size();
        int j=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i))==0){
                    c--;
                }
            }
            while(c==0){
                if(min>(i-j+1)){
                    min=i-j+1;
                    si=j;
                }
                if(hm.containsKey(s.charAt(j))){
                    hm.put(s.charAt(j),hm.get(s.charAt(j))+1);
                    if(hm.get(s.charAt(j))>0){
                        c++;
                    }
                }
                j++;

            }
        }
        if( min==Integer.MAX_VALUE) return "";
        return s.substring(si,si+min);
        
    }
}