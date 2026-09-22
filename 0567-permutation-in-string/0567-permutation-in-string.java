class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<n;i++){
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
        }
        int j=0;
        for(int i=0;i<m;i++){
             hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
            if((i-j+1)==n){
                 if(hm1.equals(hm2)) return true;
                hm2.put(s2.charAt(j),hm2.get(s2.charAt(j))-1);
                if(hm2.get(s2.charAt(j))==0){
                    hm2.remove(s2.charAt(j));
                }
                j++;
            }
            
          
           

        }
        return false;
        
    }
}