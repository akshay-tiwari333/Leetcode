class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] arr) {
        dp=new int[100][100];
        return helper(arr,0,0);
    }
    public int helper(int[][] arr,int i,int j){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length) return 0;
        if(arr[i][j]==1) return 0;
        if(i==arr.length-1 && j==arr[0].length-1) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        int r=helper(arr,i,j+1);
        int d=helper(arr,i+1,j);
        return dp[i][j]= r+d;
    }
}