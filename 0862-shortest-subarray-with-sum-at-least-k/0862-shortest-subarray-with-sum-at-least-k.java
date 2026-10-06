class Solution {
    public int shortestSubarray(int[] nums, int k) {
        Deque<Integer> d=new ArrayDeque<>();
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(arr[i]>=k){
                min=Math.min(min,i+1);
            }
            while(!d.isEmpty() && arr[i]-arr[d.peekFirst()]>=k){
                min=Math.min(min,i-d.pollFirst());
            }
            while(!d.isEmpty() && arr[i]<=arr[d.peekLast()]){
                d.pollLast();
            }
            d.offerLast(i);

        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
        
    }
}