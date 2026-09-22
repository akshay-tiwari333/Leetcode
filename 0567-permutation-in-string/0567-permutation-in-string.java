class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        char[] a=s1.toCharArray();
        Arrays.sort(a);
        String ans=new String(a);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String st=s2.substring(i,i+n);
            char[] b=st.toCharArray();
            Arrays.sort(b);
            String res=new String(b);
            if(ans.equals(res)) return true; 
        }
        return false;
        
    }
}