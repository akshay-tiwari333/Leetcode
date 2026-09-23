class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int i=0;
        while(i<chars.length){
            int j=i+1;
            int c=1;
            while(j<chars.length && chars[i]==chars[j]){
                c++;
                j++;
            }
            chars[idx++]=chars[i];
            if(c>1){
                String ans=String.valueOf(c);
                for(char k: ans.toCharArray()){
                    chars[idx++]=k;
                }
            }
            i=j;

        }
        return idx;
        
    }
}