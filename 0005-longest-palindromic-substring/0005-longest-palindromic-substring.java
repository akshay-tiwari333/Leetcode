class Solution {
    public String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        int si=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPrime(s,i,j)){
                    if(max<(j-i+1)){
                        max=j-i+1;
                        si=i;

                    }

                }
            }
        }
        return s.substring(si,si+max);
        
    }
    public boolean isPrime(String s,int i,int j){
       if(i>=j) return true;
       if(s.charAt(i)==s.charAt(j)){
        return isPrime(s,i+1,j-1);
       }
       return false;
    }
}