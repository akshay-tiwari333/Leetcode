class Solution {
    public int minimumDeletions(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int mi = -1;
        int si = -1;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > max) {
                max = nums[i];
                mi = i;
            }

            if(nums[i] < min) {
                min = nums[i];
                si = i;
            }
        }
        int bothLeft = Math.max(mi, si) + 1;
        int bothRight = nums.length - Math.min(mi, si);
        int leftRight = (Math.min(mi, si) + 1) + (nums.length - Math.max(mi, si));
        return Math.min(bothLeft, Math.min(bothRight, leftRight));
    }
}