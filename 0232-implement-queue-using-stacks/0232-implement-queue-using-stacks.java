class MyQueue {
    Stack<Integer> st;
    Stack<Integer> stt;


    public MyQueue() {
        st=new Stack<>();
        stt=new Stack<>();
        
    }
    
    public void push(int x) {
        st.push(x);

        
    }
    
    public int pop() {
        while(st.size()>1){
            stt.add(st.pop());
        }
        int ans=st.pop();
        while(stt.size()>0){
            st.add(stt.pop());
        }
        return ans;
        
    }
    
    public int peek() {
         while(st.size()>1){
            stt.add(st.pop());
        }
        int res=st.peek();
         while(stt.size()>0){
            st.add(stt.pop());
        }
        return res;

        
    }
    
    public boolean empty() {
        if(st.isEmpty()) return true;
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */