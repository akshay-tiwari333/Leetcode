class Solution {
    public boolean validPath(int n, int[][] edges, int s, int e) {
        boolean[] v=new boolean[n];
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> ans=new ArrayList<>();
            ls.add(ans);
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            ls.get(a).add(b);
            ls.get(b).add(a);
        }
        
        bfs(ls,s,v);
        return v[e];
        
    }
    public void bfs(List<List<Integer>> ans,int i,boolean[] v){
        v[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int p=q.poll();
            for(int e : ans.get(p)){
                if(v[e]==false){
                    v[e]=true;
                    q.add(e);
                }
            }
        }
    }
}