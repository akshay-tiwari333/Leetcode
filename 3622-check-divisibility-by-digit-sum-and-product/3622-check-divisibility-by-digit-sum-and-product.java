class Solution {
    public boolean checkDivisibility(int n) {
        int ans=n;
        int sum=0;
        int p=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            p=p*rem;
            n=n/10;
        }
        if(ans%(sum+p)==0) return true;
        return false;
        
    }
}