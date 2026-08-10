class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 1) return "1";
            
        String ans = countAndSay(n - 1);
        for (int i = 0; i<ans.length(); i++) {
            char res = ans.charAt(i);
            int c = 1;
            while ( i<ans.length()-1 && res == ans.charAt(i + 1)) {
                c++;
                i++;
            }
            sb.append(c);
            sb.append(res);
        }

        return sb.toString();

    }
}