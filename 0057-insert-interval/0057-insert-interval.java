class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res=new int[intervals.length+1][2];
        int k=0;
        for(int i=0;i<intervals.length;i++){
            res[k++]=intervals[i];
        }
        res[k]=newInterval;
      
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(res,Comparator.comparing(i->i[0]));
        int s=res[0][0];
        int e=res[0][1];
        for(int i=1;i<res.length;i++){
            int ss=res[i][0];
            int ee=res[i][1];
            if(e>=ss){
                e=Math.max(e,ee);
            }
            else{
                ans.add(new int[]{s,e});
                s=ss;
                e=ee;
            }
        }
        ans.add(new int[]{s,e});
        return ans.toArray(new int[ans.size()][]);

        
    }
}