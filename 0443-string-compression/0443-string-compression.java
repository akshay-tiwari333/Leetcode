class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<chars.length){
            int c=1;
            int j=i+1;
            while( j<chars.length && chars[i]==chars[j]){
                
                c++;
                j++;
            }
            sb.append(chars[i]);
            if(c>1) sb.append(c);
            
             i=j;
        }
       
        for(int k =0;k<sb.length();k++){
            chars[k]=sb.charAt(k);
        }
        return sb.length();
        
    }
}