class Solution {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int c=0;
        boolean[] v=new boolean[n];
        for(int i=0;i<n;i++){
            if(!v[i]){
                bfs(adj,i,v);
                c++;
            }
        }
        return c;
        
    }
    public void bfs(int[][] adj,int i,boolean[] v){
        int n=adj.length;
        v[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int p=q.poll();
            for(int j=0;j<n;j++){
                if(adj[p][j]==1 && v[j]==false){
                    q.add(j);
                    v[j]=true;
                }
            }
        }
    }
}