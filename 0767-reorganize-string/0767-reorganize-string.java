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
        
        char ch=' ';
        int max=0;
        for(char key: hm.keySet()){
            if(hm.get(key)>max){
                max=hm.get(key);
                ch=key;
            }
        }
        char[] arr=new char[s.length()];
        int i=0;
        while(hm.get(ch)>0){
            if(i>=arr.length) i=1;
            arr[i]=ch;
            i=i+2;
            hm.put(ch,hm.get(ch)-1);
        }
        for(char a='a'; a<='z';a++){
            if(!hm.containsKey(a)) continue;
            else{
                while(hm.get(a)>0){
                     if(i>=arr.length) i=1;
            arr[i]=a;
            i=i+2;
            hm.put(a,hm.get(a)-1);
                }

            }
        }
        return new String(arr);

        
    }
}