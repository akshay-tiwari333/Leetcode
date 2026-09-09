class Solution {
    public int uniquePathsIII(int[][] grid) {
        int s=-1;
        int e=-1;
        boolean[][] v=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=-1){
                    c++;
                }
                if(grid[i][j]==1){
                    s=i;
                    e=j;
                }
            }
        }
        return helper(grid,s,e,v,c);   
    }
    public int helper(int[][] grid,int i,int j,boolean[][] v,int c){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return 0;
        if(grid[i][j]==-1) return 0;
        if(v[i][j]) return 0;
        if(grid[i][j] == 2){
            if(c==1) return 1;
            else return 0;
        }
        v[i][j]=true;
        int r=helper(grid,i,j+1,v,c-1);
        int d=helper(grid,i+1,j,v,c-1);
        int l=helper(grid,i,j-1,v,c-1);
        int u=helper(grid,i-1,j,v,c-1);
        v[i][j]=false;
        return r+d+l+u;
    }
}