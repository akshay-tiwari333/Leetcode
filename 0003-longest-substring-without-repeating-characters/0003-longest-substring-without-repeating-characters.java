class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int j=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(s.charAt(i));
            max=Math.max((i-j+1),max);
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
        
    }
}