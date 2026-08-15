class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()<=k) return "0";
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(st.size()>0){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
        
    }
}