class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for(int j = 1; j <= n / 2; j++) {

            String ans = s.substring(0, j);

            if(n % j != 0)
                continue;

            StringBuilder sb = new StringBuilder();

            while(sb.length() < n) {
                sb.append(ans);
            }

            if(sb.toString().equals(s))
                return true;
        }

        return false;
    }
}