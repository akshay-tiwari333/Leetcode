class Solution {
    public boolean checkDivisibility(int n) {
        int ans=n;
        int n1=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        int p=1;
        while(n1>0){
            int rem=n1%10;
            p=p*rem;
            n1=n1/10;
        }
        if(ans%(sum+p)==0) return true;
        return false;
        
    }
}