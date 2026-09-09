class Solution {
    public long countCommas(long n) {

        if(n < 1000) {
            return 0;
        }
        else if(n < 1000000) {
            return n - 1000 + 1;
        }
        else if(n < 1000000000) {
            return (n - 1000 + 1)
                 + (n - 1000000 + 1);
        }
        else if(n < 1000000000000L) {
            return (n - 1000 + 1)
                 + (n - 1000000 + 1)
                 + (n - 1000000000 + 1);
        }
        else if(n < 1000000000000000L) {
            return (n - 1000 + 1)
                 + (n - 1000000 + 1)
                 + (n - 1000000000 + 1)
                 + (n - 1000000000000L + 1);
        }
        else {
            return (n - 1000 + 1)
                 + (n - 1000000 + 1)
                 + (n - 1000000000 + 1)
                 + (n - 1000000000000L + 1)
                 + (n - 1000000000000000L + 1);
        }
    }
}