class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp=new int[101][101][601];
        int[][] count=new int[strs.length][2];
        for(int i = 0; i < strs.length; i++) {

    for(int j = 0; j < strs[i].length(); j++) {

        if(strs[i].charAt(j) == '0') {
            count[i][0]++;
        }
        else {
            count[i][1]++;
        }
    }
}
return helper(count,m,n,0);
        
    }
    public int helper(int[][] c,int m,int n,int i){
        if(i>=c.length) return 0;
        if(dp[m][n][i]!=0) return dp[m][n][i];
        int t=0;
        if(c[i][0]<=m && c[i][1]<=n){
            t=1+helper(c,m-c[i][0],n-c[i][1],i+1);
        }
        int s=helper(c,m,n,i+1);
        return  dp[m][n][i]= Math.max(t,s);
    }
}