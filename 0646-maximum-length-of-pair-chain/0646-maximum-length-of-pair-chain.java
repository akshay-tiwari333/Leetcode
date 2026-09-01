class Solution {
    public int findLongestChain(int[][] pairs) {
         Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
          int s=pairs[0][0];
          int e=pairs[0][1];
          int c=1;
          for(int i=0;i<pairs.length;i++){
            if(e<pairs[i][0]){
                c++;
                s=pairs[i][0];
                e=pairs[i][1];
            }
          }
          return c;
        
    }
}