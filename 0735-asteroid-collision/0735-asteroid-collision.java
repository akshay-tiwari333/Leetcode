class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                st.push(nums[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 &&  st.peek()<Math.abs(nums[i])){
                    st.pop();
                }
                if ( !st.isEmpty() &&st.peek()<0){
                    st.push(nums[i]);
                }
                if(!st.isEmpty() && st.peek()==Math.abs(nums[i])){
                    st.pop();
                }
               else if(st.isEmpty()){
                    st.push(nums[i]);
                }
            }  

        }
        int[] arr=new int[st.size()];
       
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;

        
    }
}