class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[100][100];
        return helper(m,n,0,0);  
    }
    public int helper(int m,int n,int i,int j){
        if(i==m-1 && j==n-1) return 1;
        if(i<0 || j<0 || i>=m || j>=n) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int r=helper(m,n,i,j+1);
        int d=helper(m,n,i+1,j);
        return dp[i][j]=r+d;
    }
}