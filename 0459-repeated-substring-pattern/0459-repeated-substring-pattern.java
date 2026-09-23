class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for(int j = n/2; j >=1; j--) {

            String ans = s.substring(0, j);

            if(n % j != 0)
                continue;
                int t=n/ans.length();

            StringBuilder sb = new StringBuilder();

            while(t>0) {
                sb.append(ans);
                t--;
            }

            if(sb.toString().equals(s))
                return true;
        }

        return false;
    }
}