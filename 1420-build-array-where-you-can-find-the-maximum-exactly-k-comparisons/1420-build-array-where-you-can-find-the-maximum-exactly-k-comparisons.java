class Solution {
    int[][][] dp;
    int mod;
    public int numOfArrays(int n, int m, int k) {
         dp = new int[n][m + 2][k + 1];
        for(int i = 0; i < n; i++) {
    for(int j = 0; j <= m+1; j++) {
        Arrays.fill(dp[i][j], -1);
    }
}
        mod = 1000000007;
        return helper(n,m,k,0,-1,0);
        
    }
    public int helper(int n,int m,int k,int idx,int max,int searchCost){
        if(idx==n){
            if(searchCost==k){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(searchCost > k)
    return 0;
      
        if(dp[idx][max+1][searchCost]!=-1) return dp[idx][max+1][searchCost];
        long ans=0;
        for(int i=1;i<=m;i++){
            if(i>max){
                ans=(ans+helper(n,m,k,idx+1,i,searchCost+1))%mod;
            }
            else{
                ans=(ans+helper(n,m,k,idx+1,max,searchCost))%mod;
            }

        }
        return dp[idx][max+1][searchCost]=(int) ans;

    }
}