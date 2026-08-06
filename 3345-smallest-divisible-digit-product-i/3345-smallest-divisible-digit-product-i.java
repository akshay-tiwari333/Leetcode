class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
             int ans=n;
             int p=1;
          while(ans>0){

            int rem=ans%10;
            p=p*rem;
            ans=ans/10;
            
        }
        if(p%t==0){
            return n;
        }
        else{
            n++;
        }

        }
       
        
    }
}