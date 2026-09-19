class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] v=new boolean[rooms.size()];
        v[0]=true;
        dfs(rooms,v,0);
        for(boolean b: v){
            if(b==false) return false;
        }
        return true;

        
    }
    public void dfs(List<List<Integer>> rooms,boolean[] v,int i){
        
        v[i]=true;
        
        for(int j : rooms.get(i)){
            if(v[j]==false){
                v[j]=true;
                dfs(rooms,v,j);
            }
        }
        
        }
    }
