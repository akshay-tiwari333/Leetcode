class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.length();i++){
            if(Character.isLetter(st.charAt(i))){
                sb.append(st.charAt(i));
            }
            else if(Character.isDigit(st.charAt(i))){
                 sb.append(st.charAt(i));

            }
            else{
                continue;
            }
        }
        StringBuilder sbb=new StringBuilder(sb);
      
        if(sb.reverse().toString().equals(sbb.toString())) 
        {
            return true;
        }
        return false;
       
        
    }
}