class Solution {
    public int reverse(int x) {
        if(x == 0)
    return 0;
        StringBuilder sb=new StringBuilder();
        String ans=String.valueOf(x);
        if(ans.charAt(0)=='-') 
        {
            sb.append('-');
              if(x == Integer.MIN_VALUE)
        return 0;

            x=-x;
        }
        int rev=0;
        while(x>0){
            int digit=x%10;
            sb.append(digit);
            x=x/10;
        }
        String res=sb.toString();
        long an=Long.parseLong(res);
       if(an > Integer.MAX_VALUE || an < Integer.MIN_VALUE)
    return 0;

return (int)an;
       
    }
}