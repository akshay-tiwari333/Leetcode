class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans=new ArrayList<>();
        int i=num.length-1;
        int sum=0;
        int c=0;
        while(i>=0){
            sum=c;
            sum=sum+num[i];
            i--;
            sum=sum+k%10;
            k=k/10;
            int v=sum%10;
            c=sum/10;
            ans.add(v);
        }
        while(k>0){
            sum=c;
            sum=sum+k%10;
             int v=sum%10;
             c=sum/10;
             k=k/10;
            ans.add(v);
        }
        if(c==1) ans.add(1);
        Collections.reverse(ans);
        return ans;
        
    }
}