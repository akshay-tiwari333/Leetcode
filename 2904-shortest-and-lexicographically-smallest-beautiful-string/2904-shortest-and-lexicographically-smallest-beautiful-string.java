class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min=Integer.MAX_VALUE;
        int j=0;
        int si=-1;
       
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
            while(c==k){
                if(min>(i-j+1)){
                    min=i-j+1;
                    si=j;
                }
                else if(min == i-j+1 && s.substring(j, i+1).compareTo(s.substring(si, si+min)) < 0){
    si = j;
}
                
                if(s.charAt(j)=='1'){
                    j++;
                    c--;
                }
                else{
                    j++;
                }
            }
           
           
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(si,si+min);
        
    }
}