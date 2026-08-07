class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        int sum=0;
        while(i>=0 && j>=0){
            sum=c;
            sum=sum+a.charAt(i)-'0';
            i--;
            sum=sum+b.charAt(j)-'0';
            j--;
            sb.append(sum%2);
            c=sum/2;
        }
        while(i>=0){
            sum=c;
             sum=sum+a.charAt(i)-'0';
             i--;
             sb.append(sum%2);
             c=sum/2;
        }
        while(j>=0){
            sum=c;
             sum=sum+b.charAt(j)-'0';
            j--;
             sb.append(sum%2);
            c=sum/2;
        }
        if(c==1) sb.append(1);
        sb.reverse();
        
        return sb.toString();
        
    }
}