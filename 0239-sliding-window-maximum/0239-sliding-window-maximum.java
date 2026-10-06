class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr=new int[nums.length-k+1];
        Deque<Integer> d=new ArrayDeque<>();
        int z=0;
        for(int i=0;i<nums.length;i++){
            while(!d.isEmpty() && d.peekFirst()<=i-k){
                d.pollFirst();
            }
            while(!d.isEmpty() && nums[d.peekLast()]<=nums[i]){
                d.pollLast();
            }
            d.offerLast(i);
            if(i>=k-1){
                arr[z++]=nums[d.peekFirst()];
            }
        }
        return arr;

        
    }
}