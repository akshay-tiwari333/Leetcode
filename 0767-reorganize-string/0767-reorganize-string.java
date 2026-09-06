class Solution {
    public String reorganizeString(String s) {
        
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))>(s.length()+1)/2){
                return "";
            }
        }
        int max=Integer.MIN_VALUE;
        char ch=' ';
        for(char ans: hm.keySet()){
            if(hm.get(ans)>max){
                max=hm.get(ans);
                ch=ans;
            }
        }
        int i=0;
        char[] st=new char[s.length()];
        while(hm.get(ch)>0){
             if(i>=s.length()) i=1;
            st[i]=ch;
            i=i+2;
             hm.put(ch,hm.get(ch)-1); 
        }
        for(char in='a';in<='z';in++){
            if(!hm.containsKey(in)) continue;
            else{
           while(hm.get(in)>0){
            if(i>=s.length()) i=1;
            st[i]=in;
            i=i+2;
             hm.put(in,hm.get(in)-1);
           }
        }
        }
        return new String(st);
        
    }
}