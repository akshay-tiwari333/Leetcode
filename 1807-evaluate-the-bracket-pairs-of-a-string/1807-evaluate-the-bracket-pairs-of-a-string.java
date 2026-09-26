class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> hm=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            hm.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder sb=new StringBuilder();
         StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                while(s.charAt(i)!=')'){
                   if(s.charAt(i)!='('){
                    sb.append(s.charAt(i));
                   
                   }
                    i++;
                }
                if(hm.containsKey(sb.toString())){
                    ans.append(hm.get(sb.toString()));
                }
                else{
                    ans.append('?');

                }
                sb.setLength(0);


            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();


        
    }
}