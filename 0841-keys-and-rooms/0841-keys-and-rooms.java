class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] v=new boolean[rooms.size()];
        v[0]=true;
        bfs(rooms,v,0);
        for(boolean b: v){
            if(b==false) return false;
        }
        return true;

        
    }
    public void bfs(List<List<Integer>> rooms,boolean[] v,int i){
        Queue<Integer> q=new LinkedList<>();
        v[i]=true;
        q.add(i);
        while(q.size()>0){
            int p=q.poll();
            for(int e: rooms.get(p)){
                if(v[e]==false){
                    v[e]=true;
                    q.add(e);
                }
            }
        }
    }
}