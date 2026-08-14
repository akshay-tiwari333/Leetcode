class Solution {
    public int largestRectangleArea(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[nums.length];
        int[] pse=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<nums.length;i++){
             while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);

        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=(nse[i]-pse[i]-1)*nums[i];
            max=Math.max(ans,max);

        }
        return max;
        
    }
}