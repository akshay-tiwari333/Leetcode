class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<arr2.length;j++){
                int res=Math.abs(arr1[i]-arr2[j]);
                if(res<min){
                    min=res;
                }
            }
            li.add(min);  
        }
        int c=0;
        for(int i: li){
            if(i>d)c++;
        }
        return c;
        
    }
}