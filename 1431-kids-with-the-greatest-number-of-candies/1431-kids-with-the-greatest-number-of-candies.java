class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        Boolean[] b=new Boolean[candies.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)  {
                b[i]=true;
            }
            else{
               b[i]= false;
            }
        }
        for(Boolean i : b){
            ans.add(i);
        }
        return ans;
        
    }
}