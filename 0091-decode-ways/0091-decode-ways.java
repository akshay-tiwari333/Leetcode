class Solution {
    int[] dp;
    public int numDecodings(String s) {
        dp=new int[s.length()];
        return helper(s,0);
        
    }
    public int helper(String s,int i){
        if(i==s.length()) return 1;
        if(dp[i]!=0) return dp[i];
        if(s.charAt(i)=='0') return 0;
        int p=helper(s,i+1);
        int np=0;
        if(i+1<s.length()){
        if(s.charAt(i)=='1'|| s.charAt(i)=='2' && s.charAt(i+1)<='6'){
            np=helper(s,i+2);
        }
        }
        return dp[i]= p+np;
   

    }
}