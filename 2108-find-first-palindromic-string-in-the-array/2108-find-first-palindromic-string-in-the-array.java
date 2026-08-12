class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i=0;i<words.length;i++){
            String st=words[i];
            boolean flag=true;
            int j=0;
            int k=st.length()-1;
            while(j<k){
                if( st.charAt(j)!=st.charAt(k)){
                    flag=false;
                    break;
                }
                else{
                    j++;
                    k--;
                }
                
            }
            if(flag){
                return st;
            }

        }
        return "";
        
    }
}