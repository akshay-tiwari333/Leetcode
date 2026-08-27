class Solution {
    Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new Boolean[s.length()];
        return  helper(s,wordDict,0); 
    }
    public boolean helper(String s,List<String> ans,int i){
        if(i==s.length()) return true;
        if(dp[i]!=null) return dp[i];
        for(int j=i+1;j<=s.length();j++){
            String res=s.substring(i,j);
            if(ans.contains(res) && helper(s,ans,j)){
                return dp[i]=true;
            }
        }
        return dp[i]= false;
    }
}