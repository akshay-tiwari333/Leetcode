class Solution {
    Boolean[][] dp;
    public String longestPalindrome(String s) {
        dp=new Boolean[1000][1000];
        int max=Integer.MIN_VALUE;
        int si=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(helper(s,i,j)){
                    if(max<(j-i+1)){
                      max=j-i+1;
                      si=i;
                    }
                  
                }
              
            }
        }
        return s.substring(si,si+max);
        
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