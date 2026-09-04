class Solution {
    Boolean[][] dp;
    public int countSubstrings(String s) {
        dp=new Boolean[1000][1000];
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(helper(s,i,j)){
                    c++;
                }
            }
        }
        return c;
        
    }
    public boolean helper(String s,int i,int j){
        if(i>j) return true;
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= helper(s,i+1,j-1);
        }
        return dp[i][j]= false;
    }
}