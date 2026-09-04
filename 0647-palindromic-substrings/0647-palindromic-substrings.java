class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(helper(s,i,j)){
                    c++;
                }
            }
        }
        return c;
        
    }
    public boolean helper(String s,int i,int j){
        if(i>j) return true;
        if(s.charAt(i)==s.charAt(j)){
            return  helper(s,i+1,j-1);
        }
        return false;
    }
}