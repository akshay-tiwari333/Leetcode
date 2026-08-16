class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                st.pop();
                }
            }
        }
        while(st.size()>0){
            sb.append(st.pop());
        }
        st.clear();
        StringBuilder sbb=new StringBuilder();
            for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st.push(t.charAt(i));
            }
            else{
               if(!st.isEmpty()){
                st.pop();
                }
            }
        }
        while(st.size()>0){
            sbb.append(st.pop());
        }
        return sb.toString().equals(sbb.toString());
        
        
    }
}