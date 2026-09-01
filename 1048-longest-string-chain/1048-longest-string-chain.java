class Solution {
    int[][] dp;
    public int longestStrChain(String[] words) {
        dp=new int[words.length][words.length+1];
        for(int i=0;i<words.length;i++){
            Arrays.fill(dp[i],-1);
        }
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        return helper(words,0,-1);
        
    }
    public int helper(String[] st,int i,int p){
        if(i>=st.length) return 0;
        if(dp[i][p+1]!=-1) return dp[i][p+1];
        int take=0;
        if(p==-1 || check(st[p],st[i])){
            take=1+helper(st,i+1,i);
        }
        int not_take=helper(st,i+1,p);
        return dp[i][p+1]= Math.max(take,not_take);
    }
    public boolean check(String prev, String curr) {
    if(curr.length() != prev.length() + 1)
        return false;

    int i = 0;
    int j = 0;

    while(i < prev.length() && j < curr.length()) {
        if(prev.charAt(i) == curr.charAt(j)) {
            i++;
        }
        j++;
    }

    return i == prev.length();
}
}