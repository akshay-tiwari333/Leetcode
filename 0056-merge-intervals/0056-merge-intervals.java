class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparing(i->i[0]));
        int s=intervals[0][0];
        int e=intervals[0][1];
        List<int[]> ans=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int ss=intervals[i][0];
            int ee=intervals[i][1];
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