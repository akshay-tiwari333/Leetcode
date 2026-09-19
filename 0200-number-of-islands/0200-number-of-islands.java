class Solution {
    public int numIslands(char[][] grid) {
        boolean [][] v=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && v[i][j]==false){
                    dfs(grid,i,j,v);
                    c++;
                }
            }
        }
        return c;
        
    }
    public void dfs(char[][] grid,int i, int j,boolean [][] v){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(v[i][j]==true) return;
        if(grid[i][j]=='0') return;
        v[i][j]=true;
        dfs(grid,i+1,j,v);
        dfs(grid,i-1,j,v);
        dfs(grid,i,j+1,v);
        dfs(grid,i,j-1,v);
    }
}